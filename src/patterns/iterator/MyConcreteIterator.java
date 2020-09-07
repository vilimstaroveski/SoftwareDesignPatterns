package patterns.iterator;

import java.util.List;

public class MyConcreteIterator implements MyIterator<String> {

	private List<String> list;
	private int curr = 0;
	
	public MyConcreteIterator(List<String> list) {
		this.list = list;
	}

	@Override
	public String next() {
		return list.get(curr++);
	}

	@Override
	public boolean hasNext() {
		return curr < list.size();
	}

}
