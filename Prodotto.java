
public class Prodotto {
	

	private String tipo;
	private String caratteristica;
	private Double numero;
	
	public Prodotto(String tipo, String caratteristica, Double numero) {
		super();
		this.tipo = tipo;
		this.caratteristica = caratteristica;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Prodotto [tipo=" + tipo + ", caratteristica=" + caratteristica + ", numero=" + numero + "]";
	}
	
	



}





