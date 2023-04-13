package com.itava0;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CustomerConfig {
    public CustomerConfig() {}

    // The CommandLineRunner bean is responsible for
    // populating the StudentRepository with some initial data.
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args -> {
            final Customer mariam = new Customer(
                    1,
                    "mariam",
                    "maraim24@gmail.com",
                    25
            );
            repository.saveAll(
                    List.of(mariam)
            );
        };
    }
}
