package obrasci.dekorator;

public class Dekorator implements Komponenta {

	private Komponenta komp;
	
	public Dekorator(Komponenta komp) {
		super();
		this.komp = komp;
	}

	public void operation(String s) {
		//neke zajednicke preinake svim dekoratorima
		komp.operation(s);
	}
}
