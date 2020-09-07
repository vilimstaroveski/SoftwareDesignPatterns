package patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("foo");
		list.add("bar");
		list.add("val");
		list.add("one");
		list.add("two");
		
		MyIterable<String> collection = new MyConcreteIterable(list);
		
		MyIterator<String> iter = collection.createIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
