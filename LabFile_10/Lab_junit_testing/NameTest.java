package com.capg.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class NameTest 	{
	@Test
	public void testGetFullName()
	{
	System.out.println("from TestPerson2");
	person per = new person("Robert","King");
	assertEquals("Robert King",per.getFullName());
	}
	@Test (expected=IllegalArgumentException.class)
	public void testNullsInName()
	{
		System.out.println("from TestPerson2 testing exceptions");
		person per1 = new person(null,null);
		}
}