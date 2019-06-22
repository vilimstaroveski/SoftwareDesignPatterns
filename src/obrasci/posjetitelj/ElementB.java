package obrasci.posjetitelj;

public class ElementB implements Element {

	@Override
	public void prihvatiPosjetitelja(Posjetitelj p) {
		p.posjetiB(this);
	}

}
