import java.util.HashMap;
import java.util.Map;

public class Lab7_4 {
	public static Map<Integer, Integer> getSquares(int a[]){
		Map<Integer, Integer> hsmap = new HashMap<>();
		for(int i=0;i<a.length;i++){
			hsmap.put(a[i], (a[i]*a[i]));
		}
		return hsmap;
	}

	public static void main(String[] args) {
		int[] arr = {2,7,4,8,6,9};
		System.out.println(getSquares(arr));
	}

}