package obrasci.posjetitelj;

import java.util.ArrayList;
import java.util.List;

public class Klijent {

	private static List<Element> elementi;
	
	public static void main(String[] args) {
		elementi = new ArrayList<>();
		//zelimo napraviti operaciju 1 nad svim elementima
		PosjetiteljZaPrvuOperaciju oper1 = new PosjetiteljZaPrvuOperaciju();
		for(Element e : elementi) {
			e.prihvatiPosjetitelja(oper1);
		}
	}
}
