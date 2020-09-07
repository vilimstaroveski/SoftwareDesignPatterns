package patterns.decorator;


/**
 * ConcreteKomponent prints out the given string to the standard output
 * ConcreteDecoratorA puts square brackets before and after the given string
 * ConcreteDecoratorB puts curly brackets before and after the given string
 * @author gilles
 *
 */
public class DecoratorDemo {

	public static void main(String[] args) {
		Component c = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent("Ja:")));
		
		c.operation("test");
	}
}
