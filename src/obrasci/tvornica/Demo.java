package obrasci.tvornica;

public class Demo {

	public static void main(String[] args) {
		//prva tvornica
		ApstraktnaTvornica tvor1 = new Tvornica();
		Proizvod proizvod = (Proizvod) tvor1.noviProizvod();
		
		//druga tvornica
		ApstraktnaTvornica tvor2 = new TvornicaZaDrugeProizvode();
		NekiDrugiProizvod proiz2 = (NekiDrugiProizvod) tvor2.noviProizvod();
	}
}
