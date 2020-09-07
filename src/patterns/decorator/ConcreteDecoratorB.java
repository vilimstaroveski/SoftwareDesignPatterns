package patterns.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component komp) {
		super(komp);
	}

	@Override
	public void operation(String s) {
		String s2 = "{"+s+"}";
		super.operation(s2);
	}
}
