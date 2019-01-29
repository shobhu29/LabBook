package com.capgemini.view;
import com.capgemini.beans.*;
import com.capgemini.beans.Person.gen;
public class PersonMain {

	public static void main(String[] args) {
		
		Person per= new Person("Shobhit","Mishra",gen.M,21,55.55F,9450971939L);	

		displayDetails(per);

		}
	
	public static void displayDetails(Person per){
		
		
		System.out.println("Person Details: ");
		System.out.println("  First Name: " + per.getFirstName());
		System.out.println("  Last Name: " + per.getLastName());
		System.out.println("  Gender: " + per.getGender());
		System.out.println("  Age: " + per.getAge());
		System.out.println("  Weight: " + per.getWeight());
		System.out.println("  PhoneNo.: " + per.getPhone_num());

}
}
