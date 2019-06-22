package obrasci.most;

public abstract class Apstrakcija {

	protected Izvodac izvodac;
	
	public Apstrakcija(Izvodac izvodac) {
		super();
		this.izvodac = izvodac;
	}
	
	public abstract void operation1();
}
