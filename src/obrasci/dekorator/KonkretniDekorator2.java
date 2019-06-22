package obrasci.dekorator;

public class KonkretniDekorator2 extends Dekorator {

	public KonkretniDekorator2(Komponenta komp) {
		super(komp);
	}

	@Override
	public void operation(String s) {
		String s2 = "{"+s+"}";
		super.operation(s2);
	}
}
