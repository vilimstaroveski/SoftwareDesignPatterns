package obrasci.prilagodnik.razredni;


public class Client {

	public static void main(String[] args) {
		Target x = new ClassAdapter();
		x.request();
	}
}
