package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> group;
	
	public Composite() {
		this.group = new ArrayList<>();
	}
	
	@Override
	public void add(Component c) {
		this.group.add(c);
	}
	
	@Override
	public void remove(Component c) {
		group.remove(group.indexOf(c));
	}
	
	@Override
	public void operation() {
		for(Component c : group) {
			c.operation();
		}
	}

}
