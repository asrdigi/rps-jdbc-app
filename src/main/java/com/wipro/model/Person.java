package com.wipro.model;

import java.time.LocalDate;

/*
 * A POJO class which is called as domain/DTO/VO object
 */
public class Person {
	private Long adharCard;
	private String name;
	private GenderTyp gender;
	private LocalDate birthdate;
	private String address;
	private Long mobile;
	
	public Person() {
		
	}

	public Person(Long adharCard, String name, GenderTyp gender, LocalDate birthdate, String address, Long mobile) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
		this.address = address;
		this.mobile = mobile;
	}

	public Long getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(Long adharCard) {
		this.adharCard = adharCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GenderTyp getGender() {
		return gender;
	}

	public void setGender(GenderTyp gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [adharCard=" + adharCard + ", name=" + name + ", gender=" + gender + ", birthdate=" + birthdate
				+ ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
}
