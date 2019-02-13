import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class CopyDataThread extends Thread{
	
	@Override
	public void run() {
		
		
		String sp ="C:\\sf.txt";
		String dp ="C:\\df.txt";
		
		int i=0;
		try {  
			FileWriter fw = new FileWriter(dp);
			FileReader fr = new FileReader(sp);

			int ch = fr.read();
		    while(ch != -1) {
		        ch = fr.read();
		        fw.write(ch);
		        i++;
		        if(i % 10 == 0) {
		        	System.out.println("10 characters are copied");
		        	Thread.sleep(5000);
		        }
		    }
		    fr.close();
		    fw.close();
		} catch (FileNotFoundException exc ) {
		    System.out.println("File not found Exception");
		} catch (IOException exc ) {
			System.out.println("Input Output Exception");
		} catch (InterruptedException exc) {
			System.out.println("Interrupted Exception");
		}
		
	}
}
public class Lab8_1{

	public static void main(String args[]) {
		
		CopyDataThread copy = new CopyDataThread();
		Thread t= new Thread(copy);
		t.start();
		
	}
}