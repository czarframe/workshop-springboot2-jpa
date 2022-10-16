package com.estudosspring.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudosspring.curso.entities.User;
import com.estudosspring.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Marrom", "maria@gmail.com", "98888888888", "12345");
        User u2 = new User(null, "Alex Verde", "alex@gmail.com", "97777777777", "12345");
        
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
