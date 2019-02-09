import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PrintDateDuration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year 1 : ");
		int year1 = sc.nextInt();
		System.out.print("Enter month 1 : ");
		int month1 = sc.nextInt();
		System.out.print("Enter day of month 1 : ");
		int dayOfMonth1 = sc.nextInt();
		LocalDate date1 = LocalDate.of(year1, month1, dayOfMonth1);
		
		System.out.print("Enter year 2 : ");
		int year2 = sc.nextInt();
		System.out.print("Enter month 2 : ");
		int month2 = sc.nextInt();
		System.out.print("Enter day of month 2 : ");
		int dayOfMonth2 = sc.nextInt();
		LocalDate date2 = LocalDate.of(year2, month2, dayOfMonth2);
		
		durationBetweenDates(date1,date2);
		sc.close();
	}

	private static void durationBetweenDates(LocalDate date1, LocalDate date2) {
		Period period = Period.between(date1, date2);
		System.out.println("Years : "+period.getYears()+", Months : "+period.getMonths()+", Days : "+period.getDays());
	}

}