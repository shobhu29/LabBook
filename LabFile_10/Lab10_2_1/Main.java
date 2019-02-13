
	package com.capg.ten_2_1;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	public class Main {
	public static void main(String[] args) {
		
			person p = new person();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("*********Welcome to our app*********");
			try {
			  
				System.out.println("Enter firstName");
				String firstName = br.readLine();
	     		p.setFirstName(firstName);
				
				System.out.println("enter lastName");
				String lastName = br.readLine();
				p.setLastName(lastName);
				
				System.out.println("enter Gender");
				String gender = br.readLine();
	    		p.setGender(gender);
				System.out.println(p);
				
				
			} catch (NumberFormatException |IOException e) {
				// TODO: handle exception
			}
			/*System.out.println("id="+c.getCid());
			System.out.println("name="+c.getCname());
			System.out.println("price="+c.getCprice());
			*/
		}
}


