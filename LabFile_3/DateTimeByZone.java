import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateTimeByZone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter zone id : \nFor Example: Africa/Accra");
		String str = sc.next();
		getTimeAndDate(str);
		sc.close();

	}

	private static void getTimeAndDate(String zoneID) {
		
		try {
			ZoneId zone = ZoneId.of(zoneID);
			ZonedDateTime zoneDateTime = ZonedDateTime.now(zone);
			System.out.println("Date is: "+zoneDateTime.getDayOfMonth()+"-"+zoneDateTime.getMonthValue()+"-"+zoneDateTime.getYear());
			System.out.println("Time is: "+zoneDateTime.getHour()+":"+zoneDateTime.getMinute()+":"+zoneDateTime.getSecond());
		}
		catch(Exception e) {
			System.out.println("");
		}
		
	}

}