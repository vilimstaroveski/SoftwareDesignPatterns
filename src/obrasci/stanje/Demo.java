package obrasci.stanje;

public class Demo {

	public static void main(String[] args) {
		Kontekst kontekst = new Kontekst();

		kontekst.operation();
		kontekst.operation();

		kontekst.promijeniStanje();

		kontekst.operation();
	}

}
