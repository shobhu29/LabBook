package com.capg.ten_2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest extends person {
     person p = new person();
	@Test
 public void testGetFirstName() {
		p.setFirstName("keerthana");
		assertEquals("keerthana",p.getFirstName());
				
	}
 public void testGetLastName() {
	 p.setLastName("karnati");
	 assertEquals("karnati",p.getLastName());
	 
 }
public void testGetGender() {
	p.setGender("f");
	assertEquals("f",p.getGender());
}
}
