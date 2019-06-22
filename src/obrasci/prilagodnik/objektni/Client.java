package obrasci.prilagodnik.objektni;

public class Client {

	public static void main(String[] args) {
		Target x = new ObjectAdapter(new Adaptee("Nesto s cim ce radit ovaj..."));
		x.request();
	}
}
