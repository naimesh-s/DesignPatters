//package com.designpattern.creational.builder;
//
//import java.time.LocalDate;
//import java.time.Period;
//
//public class UserWebDTOBuilder implements UserDTOBuilder {
//
//	private String firstName;
//	private String lastName;
//	private String age;
//	private String address;
//	
//	@Override
//	public UserDTOBuilder withFirstName(String fname) {
//		this.firstName = fname;
//		return this;
//	}
//
//	@Override
//	public UserDTOBuilder withLastName(String lname) {
//		this.lastName = lname;
//		return this;
//	}
//
//	@Override
//	public UserDTOBuilder withBirthday(LocalDate date) {
//		Period ageInYears = Period.between(date, LocalDate.now());
//	    this.age = Integer.toString(ageInYears.getYears());
//		return this;
//	}
//	
//	@Override
//	public UserDTOBuilder withAddress(Address address) {
//		this.address = address.getHouseNumber() + ", "+ address.getStreet() + ", \n" + address.getCity() +", "+address.getState()+ " - "+address.getZipcode();
//		return this;
//	}
//
//	@Override
//	public UserWebDTO build() {
//		return new UserWebDTO(this.firstName +" "+this.lastName, this.address, this.age);
//	}
//
//	@Override
//	public UserWebDTO getUserDTO() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
