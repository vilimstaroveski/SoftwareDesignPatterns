package obrasci.iterator;

import java.util.List;

public class MyConcreteIterator implements MyIterator<String> {

	private List<String> lista;
	private int curr = 0;
	
	public MyConcreteIterator(List<String> lista) {
		this.lista = lista;
	}

	@Override
	public String next() {
		return lista.get(curr++);
	}
	

	@Override
	public boolean hasNext() {
		return curr < lista.size();
	}

}
