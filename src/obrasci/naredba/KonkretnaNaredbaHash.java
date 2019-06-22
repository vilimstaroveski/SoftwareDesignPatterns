package obrasci.naredba;

import java.util.Random;

public class KonkretnaNaredbaHash implements Naredba {

	private Primatelj prim;
	
	public KonkretnaNaredbaHash(Primatelj primatelj) {
		this.prim = primatelj;
	}

	@Override
	public void execute() {
		Random r = new Random();
		int len = r.nextInt(10);
		String s = "";
		for(int i = 0; i < len; i++) {
			s += "#";
		}
		prim.write(s);
	}

	
}
