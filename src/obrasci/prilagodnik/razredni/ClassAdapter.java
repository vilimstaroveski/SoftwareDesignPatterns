package obrasci.prilagodnik.razredni;

public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void request() {
		System.out.println("Adapter radi svoje");
		//poziv metode koja je problematicna
		relatedRequest();
		System.out.println("Adapter jos radi dodatno");
	}

}
