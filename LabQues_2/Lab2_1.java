import java.util.Scanner;
public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Person Details: ");
		
		System.out.println("Enter First Name: ");
		String fname =sc.next();
		
		System.out.println("Enter Last Name: ");
		String lname =sc.next();
		
		System.out.println("Enter Gender: ");
		char gnd =sc.next().charAt(0);
		
		System.out.println("Enter Age: ");
		int age =sc.nextInt();
		
		System.out.println("Enter Weight");
		float wt =sc.nextFloat();
		
		sc.close();
		System.out.println("Person Details: ");

		System.out.println("  First Name: " + fname);
		System.out.println("  Last Name: " + lname);
		System.out.println("  Gender: " + gnd);
		System.out.println("  Age: " + age);
		System.out.println("  Weight: " + wt);

	}

}
