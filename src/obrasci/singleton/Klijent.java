package obrasci.singleton;

public class Klijent {

	
	public static void main(String[] args) {
		Singleton s = Singleton.instance();
		Singleton s2 = Singleton.instance();
		s.counter = 2;
		System.out.println("Vrijednost brojaca u s:"+s.counter);
		System.out.println("Vrijednost brojaca u s2:"+s2.counter);
		
		
	}
}
