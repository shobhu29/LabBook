public class CheckPosNegNumber {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		if(num > 0)
			System.out.println(num + " is a Positive Number.");
		else
			System.out.println(num + " is a Negative Number.");
	}

}