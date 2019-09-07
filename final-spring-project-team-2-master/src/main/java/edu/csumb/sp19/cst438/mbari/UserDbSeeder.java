package edu.csumb.sp19.cst438.mbari;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.sp19.cst438.mbari.model.User;
import edu.csumb.sp19.cst438.mbari.repositories.UserRepository;

@Component
public class UserDbSeeder implements CommandLineRunner{
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        User ricky = new User("ricky", "baca");
        User max = new User("max", "renga");
        User jesus = new User("jesus", "fernandez");
        //delete db data
        userRepository.deleteAll();
        //add db seeds
        List<User> users = Arrays.asList(ricky, max, jesus);
        userRepository.saveAll(users);
    }
}