package patterns.decorator;

public class ConcreteDecoratorA extends Decorator {

	
	public ConcreteDecoratorA(Component komp) {
		super(komp);
	}

	@Override
	public void operation(String s) {
		String s2 = "["+s+"]";
		super.operation(s2);
	}
}
