package obrasci.iterator;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("nes");
		list.add("nesdacs");
		list.add("ncasdes");
		list.add("nscdaes");
		list.add("necass");
		list.add("neass");
		
		MyIterable<String> kolekcija = new MyConcreteIterable(list);
		
		MyIterator<String> iter = kolekcija.createIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
