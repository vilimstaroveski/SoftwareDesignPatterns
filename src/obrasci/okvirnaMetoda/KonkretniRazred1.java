package obrasci.okvirnaMetoda;

import java.util.Random;

public class KonkretniRazred1 extends ApstraktniRazred {

	@Override
	public boolean decide() {
		Random rand = new Random();
		return rand.nextBoolean();
	}

	@Override
	public void saySomething() {
		System.out.println("Something1");
	}

}
