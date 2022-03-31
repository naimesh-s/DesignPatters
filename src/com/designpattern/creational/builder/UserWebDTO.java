package com.designpattern.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTO {

	private String name;
	private String address;
	private String age;
	
	private UserWebDTO(String name, String address, String age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "name= " + name + "\nage= " + age + "\naddress= " + address ;
	}
	
	public static class Builder implements UserDTOBuilder{
		
		private String firstName;
		private String lastName;
		private String age;
		private String address;
		
		@Override
		public Builder withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}

		@Override
		public Builder withLastName(String lname) {
			this.lastName = lname;
			return this;
		}

		@Override
		public Builder withBirthday(LocalDate date) {
			Period ageInYears = Period.between(date, LocalDate.now());
		    this.age = Integer.toString(ageInYears.getYears());
			return this;
		}
		
		@Override
		public Builder withAddress(Address address) {
			this.address = address.getHouseNumber() + ", "+ address.getStreet() + ", " + address.getCity() +", "+address.getState()+ " - "+address.getZipcode();
			return this;
		}

		@Override
		public UserWebDTO build() {
			return new UserWebDTO(this.firstName +" "+this.lastName, this.address, this.age);
		}
	}
}
