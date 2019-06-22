package obrasci.singleton;

public class Singleton {

	private static Singleton singl;
	public int counter;

	
	private Singleton() {
	}

	public static synchronized Singleton instance() {
		if (singl == null) {
			singl = new Singleton();
		}
		return singl;
	}
}
