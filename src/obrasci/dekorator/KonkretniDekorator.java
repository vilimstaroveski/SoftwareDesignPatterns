package obrasci.dekorator;

public class KonkretniDekorator extends Dekorator {

	
	public KonkretniDekorator(Komponenta komp) {
		super(komp);
	}

	@Override
	public void operation(String s) {
		String s2 = "["+s+"]";
		super.operation(s2);
	}
}
