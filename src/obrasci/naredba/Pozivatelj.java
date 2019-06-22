package obrasci.naredba;

public class Pozivatelj {

	private Naredba naredba;

	public Pozivatelj(Naredba naredba) {
		super();
		this.naredba = naredba;
	}
	
	public void execute() {
		//nesto dodatno
		naredba.execute();
	}
	
}
