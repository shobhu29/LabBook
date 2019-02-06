import java.util.ArrayList;
import java.util.Collections;

public class Lab7_5 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Aeropostale");
		al.add("Fila");
		al.add("Nike");
		al.add("Puma");
		al.add("Under Armour");
		al.add("Decathlon");

		Collections.sort(al);
		for(Object i:al){
			System.out.println(i);
		}
	}

}