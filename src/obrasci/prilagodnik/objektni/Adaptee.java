package obrasci.prilagodnik.objektni;

public class Adaptee {

	private String s;
	
	public Adaptee(String string) {
		s = string;
	}

	public void relatedRequest() {
		System.out.println("Metoda pozvana iz razreda kojeg adaptiramo.");
		System.out.println(s);
	}
}
