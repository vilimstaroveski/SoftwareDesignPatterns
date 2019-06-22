package obrasci.strategija.counter;

public class CounterNormal extends StrategijaCount {

	@Override
	public void count() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

