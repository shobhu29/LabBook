package com.capg.beans;

public class Person {

	private String name;
	private float age;
	
	public Person() {
		super();
	}
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person name : "+name+"\nPerson age : "+age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
