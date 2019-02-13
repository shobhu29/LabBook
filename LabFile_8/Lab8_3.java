class GenRandom implements Runnable{

	@Override
	public void run() {
		
		int n = (int) (10*Math.random());
		System.out.print(n + " : ");
		FindFact findfact = new FindFact(n);
		Thread subThr = new Thread(findfact);
		subThr.start();
	}
	
}

class FindFact implements Runnable{

	int num;
	public FindFact(int num) {
		this.num = num; 
	}
	
	@Override
	public void run() {
		int fact=1;
		while(num>0) {
			fact = fact*num--;
		}
		System.out.println(fact);
		
	}
	
}
public class Lab8_3 {
	public static void main(String[] args) {
		
		GenRandom gran = new GenRandom();
		Thread t = new Thread(gran);
		t.start();
	}
}