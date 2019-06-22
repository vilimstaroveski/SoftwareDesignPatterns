package obrasci.strategija.counter;

public class CounterEven extends StrategijaCount {

	@Override
	public void count() {
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
	}
}
