package obrasci.kompozit;

public class Klijent {

	public static void main(String[] args) {
		Komponenta komp1 = new Primitiv("Prim 1");
		Komponenta komp2 = new Primitiv("Neki drugi");
		Komponenta komp3 = new Primitiv("Treci");
		Komponenta komp4 = new Primitiv("Cetvrti neki");
		
		Komponenta kompozit = new Kompozit();
		kompozit.add(komp1);
		kompozit.add(komp2);
		kompozit.add(komp3);
		kompozit.add(komp4);
		
		kompozit.operation();
		
	}
}
