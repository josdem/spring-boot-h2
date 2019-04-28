package com.example.springbooth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jos.dem.springboot.h2.model.Person;
import com.jos.dem.springboot.h2.repository.PersonRepository;

@SpringBootApplication
@EntityScan("com.jos.dem.springboot.h2.model")
@EnableJpaRepositories("com.jos.dem.springboot.h2.repository")
public class H2Application {

  @Autowired
  private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
	}

  @Bean
  CommandLineRunner start(){
    return args -> {
      Person person  = new Person(1L, "josdem", "joseluis.delacruz@gmail.com");
      personRepository.save(person);
      personRepository.findAll().forEach(System.out::println);
    };
  }

}
