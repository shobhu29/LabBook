import java.util.Scanner;
import java.util.regex.*;

public class JobSeekerApp {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input: ");
		String username = sc.next();
		
		Pattern p = Pattern.compile("[A-Za-z]{8,}_job");
		Matcher m = p.matcher(username);
		if(m.matches())
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		
		sc.close();

	}
}