package obrasci.dekorator;

public class KonkretnaKomponenta implements Komponenta {

	private String data;
	
	public KonkretnaKomponenta(String data) {
		super();
		this.data = data;
	}	
	
	@Override
	public void operation(String s) {
		System.out.println(data+s);


	}

}
