package com.jos.dem.springboot.h2;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	private String nickname;
	private String email;

}
