package obrasci.promatrac;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subjekt {
	List<Promatrac> promatraci;
	int state;
	
	public Subjekt() {
		promatraci = new ArrayList<>();
		state = 0;
	}
	
	public void attach(Promatrac p) {
		promatraci.add(p);
	}
	public void dettach(Promatrac p) {
		promatraci.remove(promatraci.indexOf(p));
	}
	public void obavijestiPromatrace() {
		for(Promatrac p : promatraci) {
			p.update();
		}
	}
	
	public void changeState(){
		Random rand = new Random();
		state = rand.nextInt(10);
		obavijestiPromatrace();
	}
	public int getState() {
		return state;
	}
	
}
