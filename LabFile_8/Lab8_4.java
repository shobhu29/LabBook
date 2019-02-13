import java.util.ArrayList;

public class Lab8_4 implements Runnable{
	
	ArrayList<String> prodList = new ArrayList<String>();
	
	public static void main(String args[]) {
		

		Lab8_4 p = new Lab8_4();
		p.prodList.add("shobhit"); p.prodList.add("aditya"); p.prodList.add("alok"); p.prodList.add("vishu");
		Thread thread = new Thread(p);
		thread.start();
		
	}

	@Override
	public void run() {
		
		double bill=0;
		for(String s: prodList) {
			if(s.equals("shobhit"))	bill+=80;
			else if(s.equals("aditya"))	bill+=50;
			else if(s.equals("vishu"))	bill+=70;
			else if(s.equals("alok"))	bill+=75;
		}
		System.out.println("Bill Calculated : " +bill );
	}
}