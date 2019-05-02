package com.jos.dem.springboot.h2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jos.dem.springboot.h2.model.Person;
import com.jos.dem.springboot.h2.repository.PersonRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EntityScan("com.jos.dem.springboot.h2.model")
@EnableJpaRepositories("com.jos.dem.springboot.h2.repository")
public class H2Application {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  public static void main(String[] args) {
    SpringApplication.run(H2Application.class, args);
  }

  @Bean
  CommandLineRunner start(PersonRepository personRepository){
    return args -> {
      Person person  = new Person(1L, "josdem", "joseluis.delacruz@gmail.com");
      personRepository.save(person);
      personRepository.findAll().forEach(p -> log.info("person: {}", p));
    };
  }

}
