import java.util.Scanner;
import java.util.ArrayList;

public class Lab7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Ist string : ");
		String s1 = sc.nextLine();
		
		System.out.print("\nEnter IInd string : ");
		String s2 = sc.nextLine();
		
		ArrayList<String> arrayList = strOper(s1,s2);
		
		System.out.println(arrayList);
		
	}

	private static ArrayList<String> strOper(String s1, String s2) {
		
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		
		ArrayList<String> al = new ArrayList<>();
		
		for(int i=0;i<s1.length();i=i+2) {
			sb1.replace(i, i+1, s2);
		}
		s1 = sb1.toString();
		al.add(s1);
		
		if(sb1.indexOf(s2)!=sb1.lastIndexOf(s2)) {
			sb1.replace(sb1.lastIndexOf(s2),sb1.lastIndexOf(s2)+s2.length(), sb2.reverse().toString());
		}
		
		else {
			sb1.delete(0, sb1.length());
			sb1.replace(0, (s1+s2).length(), s1+s2);
		}
		
		s1 = sb1.toString();
		al.add(s1);
		
		if(sb1.indexOf(s2)!=sb1.lastIndexOf(s2)) {
			sb1.delete(sb1.indexOf(s2), sb1.indexOf(s2)+s2.length());
		}
		
		else {
			sb1.delete(0, sb1.length());
			sb1.replace(0, s1.length(), s1);
		}
		
		s1 = sb1.toString();
		al.add(s1);
		
		int len = (int) Math.ceil(s2.length()/2.0);
		String str1 = s2.substring(0, len);
		String str2 = s2.substring(len,s2.length());
		
		sb1.insert(0, str1);
		sb1.append(str2);
		s1 = sb1.toString();
		al.add(s1);
		
		for(int i=0;i<s2.length();i++) {
			s1 = s1.replace(s2.charAt(i),'*');
		}
		al.add(s1);
		return al;
	}

}