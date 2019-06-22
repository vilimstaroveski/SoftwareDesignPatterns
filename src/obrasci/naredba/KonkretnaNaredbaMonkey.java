package obrasci.naredba;

import java.util.Random;

public class KonkretnaNaredbaMonkey implements Naredba {

	private Primatelj prim;
	
	public KonkretnaNaredbaMonkey(Primatelj prim) {
		super();
		this.prim = prim;
	}

	@Override
	public void execute() {
		Random r = new Random();
		int len = r.nextInt(10);
		String s = "";
		for(int i = 0; i < len; i++) {
			s += "@";
		}
		prim.write(s);
	}

}
