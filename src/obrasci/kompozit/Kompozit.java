package obrasci.kompozit;

import java.util.ArrayList;
import java.util.List;

public class Kompozit extends Komponenta {

	private List<Komponenta> grupa;
	
	public Kompozit() {
		this.grupa = new ArrayList<>();
	}
	
	@Override
	public void add(Komponenta komp) {
		this.grupa.add(komp);
	}
	
	@Override
	public void remove(Komponenta k) {
		grupa.remove(grupa.indexOf(k));
	}
	
	@Override
	public void operation() {
		for(Komponenta k : grupa) {
			k.operation();
		}
	}

}
