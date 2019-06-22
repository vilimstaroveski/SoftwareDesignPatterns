package obrasci.proxy;

public class Proxy implements Subjekt {

	private Subjekt subjekt;
	
	public Proxy(Subjekt subjekt) {
		super();
		this.subjekt = subjekt;
	}

	@Override
	public void operation() {
		System.out.println("provjera i rad proxya");
		subjekt.operation();
	}

}
