package obrasci.naredba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Primatelj {

	PrintWriter printer;

	public Primatelj(String s) {
		super();
		try {
			this.printer = new PrintWriter(new File(s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void write(String s) {
		printer.println(s);
	}
	
	public void close() { 
		printer.close();
	}
	
	
}
