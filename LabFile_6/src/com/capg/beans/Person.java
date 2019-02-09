package com.capg.beans;

public class Person {
	
	public enum Gender{ M,F};
	private String fName;
	private String lName;
	private Gender gen;
	private int age;
	private double wt;
	private long phoneNum;
	
	public Person() {
		super();
	}

	public Person(String fName, String lName, Gender gen, int age, double wt, long phoneNum) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.gen = gen;
		this.age = age;
		this.wt = wt;
		this.phoneNum = phoneNum;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Gender getGen() {
		return gen;
	}

	public void setGen(Gender gen) {
		this.gen = gen;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWt() {
		return wt;
	}

	public void setWt(double wt) {
		this.wt = wt;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
	
}