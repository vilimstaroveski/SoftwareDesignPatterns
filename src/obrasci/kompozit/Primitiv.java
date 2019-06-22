package obrasci.kompozit;

public class Primitiv extends Komponenta {

	private String name;
	
	public Primitiv(String name) {
		super();
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println("ja sam primitiv: "+this.name);
	}

}
