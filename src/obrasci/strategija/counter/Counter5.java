package obrasci.strategija.counter;

public class Counter5 extends StrategijaCount {

	@Override
	public void count() {
		for(int i = 0; i <= 10; i+=5) {
			System.out.println(i);
		}
	}
}
