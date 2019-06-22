package obrasci.proxy;

public class Klijent {

	public static void main(String[] args) {
		Subjekt sub = new Proxy(new StvarniSubjekt());
		sub.operation();
	}
}
