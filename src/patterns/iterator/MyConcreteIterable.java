package patterns.iterator;

import java.util.List;

public class MyConcreteIterable implements MyIterable<String> {

	private List<String> list;
	
	public MyConcreteIterable(List<String> l ) {
		super();
		this.list = l;
	}

	@Override
	public MyIterator<String> createIterator() {
		return new MyConcreteIterator(list);
	}
	
	

}
