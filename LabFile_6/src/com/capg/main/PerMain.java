package com.capg.main;

import com.capg.beans.Person;
import com.capg.beans.Person.Gender;
import com.capg.bl.Schedular;
import com.capg.exceptions.NullNameException;


public class PerMain {
	
	public static Schedular sch = new Schedular();

	public static void main(String[] args) {
		try {
			sch.insertData("","Mishra",Gender.M,21,55,7567893456L);
		}catch(NullNameException ne) {
			System.out.println(ne.getMessage());
		}
	}
	
	public static void display(Person person) {
		System.out.println("______Person Details______");
		System.out.println("First Name: "+person.getfName());
		System.out.println("Last Name: "+person.getlName());
		System.out.println("Gender: "+person.getGen());
		System.out.println("Age: "+person.getAge());
		System.out.println("Weight: "+person.getWt());
		System.out.println("Phone Number: "+person.getPhoneNum());
		
	}

}