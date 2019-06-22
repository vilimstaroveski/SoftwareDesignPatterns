package obrasci.promatrac;

public class KonkretniPromatrac2 implements Promatrac {

	private Subjekt subjekt;
	
	public KonkretniPromatrac2(Subjekt subjekt) {
		super();
		this.subjekt = subjekt;
		subjekt.attach(this);
	}

	@Override
	public void update() {
		for(int i = 0; i < subjekt.getState(); i++) {
			System.out.println("Hello");
		}
	}

}
