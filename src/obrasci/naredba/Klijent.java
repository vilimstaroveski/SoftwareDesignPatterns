package obrasci.naredba;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Klijent {

	
	
	public static void main(String[] args) {
		Primatelj primatelj = new Primatelj("./src/obrasci/naredba/test.txt");
		Pozivatelj pozivateljHash = new Pozivatelj(new KonkretnaNaredbaHash(primatelj));
		Pozivatelj pozivateljMonkey = new Pozivatelj(new KonkretnaNaredbaMonkey(primatelj));
		
		pozivateljMonkey.execute();
		pozivateljHash.execute();
		pozivateljHash.execute();
		pozivateljHash.execute();
		pozivateljMonkey.execute();
		pozivateljHash.execute();
		pozivateljMonkey.execute();
		pozivateljMonkey.execute();
		
		
		primatelj.close();
		List<String> linije = null;
		try {
			linije = Files.readAllLines(Paths.get("./src/obrasci/naredba/test.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s : linije) {
			System.out.println(s);
		}
	}
	
	
}
