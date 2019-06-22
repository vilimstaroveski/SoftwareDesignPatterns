package obrasci.most;

public class Klijent {

	public static void main(String[] args) {
		Apstrakcija aps = new PrilagodenaApstrakcija(new KonkretniIzvodac());
		//stvorili smo apstrakciju koja je zapravo "PrilagodenaApstrakcija" 
		//i crta se na nacin "KonkretnogIzvodaca"
		aps.operation1();
	}
}
