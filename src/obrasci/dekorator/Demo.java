package obrasci.dekorator;


/**
 * KonkretnaKomponenta samo ispisuje predani string,
 * konkretniDekorator stavlja uglate zagrade oko tog stringa
 * konkretniDekorator2 stavlja viticaste zagrade oko tog stringa
 * @author gilles
 *
 */
public class Demo {

	public static void main(String[] args) {
		Komponenta k = new KonkretniDekorator2(new KonkretniDekorator(new KonkretnaKomponenta("Ja:")));
		
		k.operation("test");
	}
}
