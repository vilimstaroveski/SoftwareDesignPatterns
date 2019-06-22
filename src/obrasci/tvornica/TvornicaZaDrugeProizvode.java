package obrasci.tvornica;

public class TvornicaZaDrugeProizvode extends ApstraktnaTvornica {

	@Override
	public ApstraktniProizvod stvoriProizvod() {
		return new NekiDrugiProizvod();
	}

}
