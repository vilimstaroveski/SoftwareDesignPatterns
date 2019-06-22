package obrasci.kompozit;

public abstract class Komponenta {

	public abstract void operation();
	
	public void add(Komponenta k) {
		throw new UnsupportedOperationException();
	}
	public void remove(Komponenta k) {
		throw new UnsupportedOperationException();
	}
	
}
