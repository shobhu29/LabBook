import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DurationWithCurrentDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		System.out.print("Enter month : ");
		int month = sc.nextInt();
		System.out.print("Enter day of month : ");
		int dayOfMonth = sc.nextInt();
		durationWithCurrentDate(dayOfMonth,month,year);
		sc.close();

	}

	private static void durationWithCurrentDate(int dayOfMonth, int month, int year) {
		
		LocalDate currentDate = LocalDate.now();
		LocalDate enteredDate = LocalDate.of(year, month, dayOfMonth);
		Period period = Period.between(currentDate, enteredDate);
		System.out.println("Years : "+period.getYears()+", Months : "+period.getMonths()+", Days : "+period.getDays());
		
	}
	

}