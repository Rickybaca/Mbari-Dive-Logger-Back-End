package edu.csumb.sp19.cst438.mbari;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.sp19.cst438.mbari.model.Diver;
import edu.csumb.sp19.cst438.mbari.repositories.DiverRepository;

@Component
public class DiverDbSeeder implements CommandLineRunner{
    @Autowired
    DiverRepository diverRepository;

    @Override
    public void run(String... args) throws Exception{
        Diver ricky = new Diver("ricky", "baca", "rbaca@csumb.edu", "10/28/1995", "222 222-2222", "N/A", "N/A");
        Diver max = new Diver("max", "renga", "mrenga@csumb.edu", "11/15/1994", "111 111-1111", "N/A", "First time diving!");
        //delete db data
        diverRepository.deleteAll();
        //add db seeds
        List<Diver> users = Arrays.asList(ricky, max);
        diverRepository.saveAll(users);
    }
}