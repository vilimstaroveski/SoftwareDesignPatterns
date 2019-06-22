package obrasci.strategija;


import obrasci.strategija.counter.CounterEven;
import obrasci.strategija.counter.StrategijaCount;
import obrasci.strategija.hello.HelloHrv;
import obrasci.strategija.hello.StrategijaHello;

/**
 * Ovo je kontekst, StrategijaCount je strategija, a CounterEven je konkretna strategija
 * @author gilles
 *
 */
public class Kontekst {

	private static StrategijaCount counter = new CounterEven();
	private static StrategijaHello helloSayer = new HelloHrv();
	
	public static void main(String[] args) {
		helloSayer.printHello();
		counter.count();
		
	}
}
