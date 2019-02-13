import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab9_1 {
	
	
	
	public static void main(String[] args) throws IOException {
		
		String sp = "C:\\Source.txt";
		String dp = "C:\\Destination.txt";
		
		FileInputStream fin = new FileInputStream(sp);
		PrintWriter pw = new PrintWriter(dp);
		
		String s= "";
		int c;
		while((c = fin.read()) != -1) {
			s = (char)c + s;
		}
	
		pw.write(s);
		pw.flush();  
	    pw.close(); 
	    
	    fin.close();
		System.out.println("Contents Reverse Successfully !!");		
	}

}