package patterns.decorator;

public class ConcreteComponent implements Component {

	private String data;
	
	public ConcreteComponent(String data) {
		super();
		this.data = data;
	}	
	
	@Override
	public void operation(String s) {
		System.out.println(data+s);


	}

}
