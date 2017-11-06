package cz.keklak.SpringBootApp;

import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyCLR implements CommandLineRunner {
    @Autowired
    private ReservationRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Stream.of("Pepa", "Franta", "Honza").forEach(x -> 
           repository.save(new Reservation(x)));
        repository.findAll().forEach(System.out::println);
    }
}
