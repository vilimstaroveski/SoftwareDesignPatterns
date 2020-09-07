package patterns.composite;

public abstract class Component {

	public abstract void operation();
	
	public void add(Component c) {
		throw new UnsupportedOperationException();
	}
	public void remove(Component c) {
		throw new UnsupportedOperationException();
	}
	
}
