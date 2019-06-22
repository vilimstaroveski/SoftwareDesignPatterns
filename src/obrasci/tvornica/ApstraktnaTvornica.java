package obrasci.tvornica;

public abstract class ApstraktnaTvornica {

	//ovu metodu STVARNE TVORNICE moraju implementirati ovisno o njihovim proizvodima
	protected abstract ApstraktniProizvod stvoriProizvod();
	
	public ApstraktniProizvod noviProizvod() {
		//nesto nesto nesto
		return stvoriProizvod();
	}
	
}
