package com.jos.dem.springboot.h2.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

	@Id
	@GeneratedValue
	private Long id;
	private String nickname;
	private String email;

}
