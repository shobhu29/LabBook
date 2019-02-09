package com.capg.bl;

import com.capg.beans.Person;
import com.capg.beans.Person.Gender;
import com.capg.exceptions.NullNameException;
import com.capg.main.PerMain;

public class Schedular {

	public void insertData(String fName, String lName, Gender gen, int age, double wt, long phoneNum) throws NullNameException {
		
		if(!fName.equals("")&&!lName.equals("")) {
			Person person = new Person(fName,lName,gen,age,wt,phoneNum);
			PerMain.display(person);
			return;
		}
		throw new NullNameException();
	}
}