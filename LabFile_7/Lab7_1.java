import java.util.Arrays;
public class Lab7_1 {
	public static int[] getSorted(int[] a){
		
		int len = a.length;
		int[] result = new int[len];
		for(int i=0;i<len;i++){
			StringBuffer s = new StringBuffer(a[i]+ "");
			result[i] = Integer.parseInt(s.reverse().toString());
			
		}
		
		Arrays.sort(result);
		return result;
	}

	public static void main(String[] args) {
		
		int[] arr = {25,17,47,89,61,33};
		int[] result=getSorted(arr);
		for(int i=0;i<result.length;i++)
		
		System.out.println(result[i]);
	}
}