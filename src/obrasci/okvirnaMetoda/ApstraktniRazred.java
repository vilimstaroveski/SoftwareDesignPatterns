package obrasci.okvirnaMetoda;

/**
 * Apstraktni razred i konkretni razredi
 * Okvirna metoda - metoda()
 * Primitivna metoda - decide()
 * @author gilles
 *
 */
public abstract class ApstraktniRazred {

	public final void metoda() {
		System.out.println("Usao u glavnu metodu obrasca.");
		System.out.println("Koristenje apstraktne metode:");
		if(decide()) {
			System.out.println("Odluka je bila pozitivna");
		}
		else {
			System.out.println("Odluka je bila negativna");
		}
		saySomething();
	}
	//ovo su primitivne 
	public abstract boolean decide();
	public abstract void saySomething();
	
}
