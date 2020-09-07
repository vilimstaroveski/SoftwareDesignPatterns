package patterns.composite;

public class Leaf extends Component {

	private String val;
	
	public Leaf(String name) {
		super();
		this.val = name;
	}

	@Override
	public void operation() {
		System.out.println(this.val + " Leaf");
	}

}
