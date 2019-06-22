package obrasci.iterator;

import java.util.List;

public class MyConcreteIterable implements MyIterable<String> {

	private List<String> lista;
	
	public MyConcreteIterable(List<String> l ) {
		super();
		this.lista = l;
	}

	@Override
	public MyIterator createIterator() {
		return new MyConcreteIterator(lista);
	}
	
	

}
