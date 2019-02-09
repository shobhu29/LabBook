import java.util.Scanner;

public class StringOperation {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		showMenu();
	}

	private static void showMenu() {
		while(true) {
			System.out.print("Enter a string : ");
			String str = sc.next();
			System.out.println("1.Add String to itself");
			System.out.println("2.Replace odd position with #");
			System.out.println("3.Remove duplicate characters in the String");
			System.out.println("4.Change odd characters to upper case");
			System.out.println("5.Exit");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			
			case 1:addString(str);
			break;
			case 2:replaceWithHash(str);
			break;
			case 3:removeDuplicate(str);
			break;
			case 4:changeOddCharacters(str);
			break;
			case 5:System.exit(0);
			
			default:System.out.println("You entered a wrong choice!!");
			}
		}
		
	}

	private static void addString(String str) {
		System.out.println(str+str);		
	}

	private static void replaceWithHash(String str) {
		StringBuilder strb = new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				strb.setCharAt(i,'#');;
			}
		}
		System.out.println(strb);
	}

	private static void removeDuplicate(String str) {
		String s = new String();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(s.indexOf(ch)<0) {
				s = s + ch;
			}
		}
		System.out.println(s);
	}

	private static void changeOddCharacters(String str) {
		StringBuilder strb = new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				strb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
		}
		System.out.println(strb);
	}

}
