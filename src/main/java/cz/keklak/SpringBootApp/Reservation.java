package cz.keklak.SpringBootApp;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import org.springframework.data.annotation.Id;
import javax.persistence.Id;

@Entity
public class Reservation implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String reservationName;

    public Long getId() {
        return id;
    }
    public String getReservationName() {
        return reservationName;
    }
    public Reservation(String reservationName) {
        this.reservationName = reservationName;
    }
    public Reservation() {
    }
    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", reservationName=" + reservationName + '}';
    }
}