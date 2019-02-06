import java.util.ArrayList;
import java.util.List;

public class Lab7_3 {
	
	public static List<String> removeElements(List<String> list1, List<String> list2){
		list1.removeAll(list2);
		return list1;
	}
	
	public static void main(String[] args) {
		List<String> arrlist1 = new ArrayList<>();
		List<String> arrlist2 = new ArrayList<>();
		arrlist1.add("15");
		arrlist1.add("25");
		arrlist1.add("35");
		arrlist1.add("45");
		arrlist1.add("55");
		arrlist2.add("35");
		arrlist2.add("25");
		arrlist2.add("95");
		arrlist2.add("85");
		arrlist2.add("75");
		System.out.println(removeElements(arrlist1,arrlist2));
	}
}