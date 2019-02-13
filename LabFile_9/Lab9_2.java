import java.io.FileInputStream;
import java.io.IOException;

public class Lab9_2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("C:\\numbers.txt");
		
		int i;
		String str = "";
		while((i = fin.read()) != -1) {
			str += (char)i;
		}
		
		String num[] = str.split(",");
		int len = num.length;
		int [] nums = new int[len];
		
		for(int j = 0; j < len; j++) {
			
			nums[j] = Integer.parseInt(num[j].trim());
			
			if(nums[j] % 2 == 0) {
				System.out.println("Even numbers from the file" + nums[j]);
			}
		}
		
		fin.close();

	}

}