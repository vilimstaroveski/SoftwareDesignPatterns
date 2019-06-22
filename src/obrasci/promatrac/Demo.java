package obrasci.promatrac;

public class Demo {

	public static void main(String[] args) {
		Subjekt s = new Subjekt();
		Promatrac p1 = new KonkretniPromatrac1(s);
		Promatrac p2 = new KonkretniPromatrac2(s);
		System.out.println("Mijenjam stanje");
		s.changeState();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Mijenjam stanje");
		s.changeState();
	}
}
