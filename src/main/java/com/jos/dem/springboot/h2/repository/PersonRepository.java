package com.jos.dem.springboot.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jos.dem.springboot.h2.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

	Person save(Person person);

}
