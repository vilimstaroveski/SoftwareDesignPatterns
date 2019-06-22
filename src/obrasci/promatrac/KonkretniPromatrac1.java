package obrasci.promatrac;

public class KonkretniPromatrac1 implements Promatrac{

	private Subjekt subjekt;
	
	public KonkretniPromatrac1(Subjekt subjekt) {
		super();
		this.subjekt = subjekt;
		subjekt.attach(this);
	}

	@Override
	public void update() {
		System.out.println(subjekt.getState());
	}

}
