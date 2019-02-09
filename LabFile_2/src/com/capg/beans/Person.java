package com.capg.beans;

public class Person {
	
	private String firstName;
	private String lastName;
	public enum gen{M,F};
	private gen gender;
	private int age;
	private float weight;
	private long phone_num;
	
	public Person(){
		super();		
	}
	
	public Person(String firstName, String lastName, gen gender, int age, float weight, long phone_num) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.phone_num = phone_num;
	}


	public long getPhone_num() {
		return phone_num;
	}


	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}


	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public gen getGender() {
		return gender;
	}


	public void setGender(gen gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	

}