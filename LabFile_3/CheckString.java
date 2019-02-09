import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next().toUpperCase();
		System.out.println(isPositive(str));
		sc.close();
	}

	private static boolean isPositive(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)-str.charAt(i+1))>0) {
				return false;
			}
		}
		return true;
	}

}