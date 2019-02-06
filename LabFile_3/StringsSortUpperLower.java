import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StringsSortUpperLower {



		public static void main(String[] args) {

			
			StringsSortUpperLower l=new StringsSortUpperLower();

			String[] a = { "Shobhit", "Adi", "Alok", "Vishu","Ratani" };
			String[] b = l.strings(a);
			for (String s : b)
				System.out.println(s);

		}

		public String[] strings(String[] str) {
			
			int len = str.length;
			String[] str1 = new String[len];

			Arrays.sort(str);
			int i = 0;
			for (String s : str) {
				if (str.length % 2 == 0) {
					if (i < (len / 2)) {
						str1[i] = s.toUpperCase();
						i++;
					} else {
						str1[i] = s.toLowerCase();
						i++;
					}
				}
				else{
					if (i <= (len / 2)) {
						str1[i] = s.toUpperCase();
						i++;
					} else {
						str1[i] = s.toLowerCase();
						i++;
					}
				}
			}

			return str1;
		}

	}

