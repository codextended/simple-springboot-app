package com.smathcadet.simpleapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student smath = new Student(
                    "Smath",
                    "smath@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 23));

            Student cadet = new Student(
                    "Cadet",
                    "caet@gmail.com",
                    LocalDate.of(1995, Month.APRIL, 12));

            repository.saveAll(List.of(smath, cadet));
        };
    }
}
