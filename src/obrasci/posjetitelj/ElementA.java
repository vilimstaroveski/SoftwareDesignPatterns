package obrasci.posjetitelj;

public class ElementA implements Element {

	@Override
	public void prihvatiPosjetitelja(Posjetitelj p) {
		p.posjetiA(this);
	}

}
