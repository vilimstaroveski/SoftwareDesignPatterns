package obrasci.prilagodnik.objektni;

public class ObjectAdapter implements Target {

	private Adaptee adaptee;

	public ObjectAdapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		System.out.println("Adapter radi svoj posao.");
		//poziv metode koja je problematicna
		adaptee.relatedRequest();
		System.out.println("Adapter radi jos dodatno");
	}
	
	
}
