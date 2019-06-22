package obrasci.stanje;

public class Kontekst {

	private Stanje stanje;
	
	public Kontekst() {
		stanje = new KonkretnoStanje();
	}
	
	public void operation() { 
		stanje.operation();
	}
	
	public void promijeniStanje() {
		if(stanje instanceof KonkretnoStanje) {
			stanje = new KonkretnoStanje2();
		}
		else {
			stanje = new KonkretnoStanje();
		}
	}
}
