package com.atuldwivedi.learn.springboot.eignclientdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String street1;
	private String street2;
	private Integer pin;
}
