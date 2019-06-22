package obrasci.most;

public class PrilagodenaApstrakcija extends Apstrakcija {

	public PrilagodenaApstrakcija(Izvodac izvodac) {
		super(izvodac);
	}

	@Override
	public void operation1() {
		izvodac.operation();
	}

	
}
