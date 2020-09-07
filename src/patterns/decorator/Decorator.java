package patterns.decorator;

public class Decorator implements Component {

	private Component x;
	
	public Decorator(Component x) {
		super();
		this.x = x;
	}

	public void operation(String s) {
		x.operation(s);
	}
}
