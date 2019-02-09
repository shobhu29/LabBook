import java.time.LocalDate;
import java.util.Scanner;

public class ProductWarrantyExpires{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product purchase date");
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		System.out.print("Enter month : ");
		int month = sc.nextInt();
		System.out.print("Enter day of month : ");
		int dayOfMonth = sc.nextInt();
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		
		System.out.println("Enter warrantee period");
		System.out.print("Enter number of year : ");
		int y = sc.nextInt();
		System.out.print("Enter number of month : ");
		int m = sc.nextInt();
		
		warranteePeriod(date,y,m);
		sc.close();
	}

	private static void warranteePeriod(LocalDate date, int y, int m) {
		LocalDate newDate = date.plusMonths(m);
		newDate = newDate.plusYears(y);
		System.out.println("Product Warranty expiry date : "+newDate);
		
	}

}