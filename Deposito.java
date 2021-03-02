import java.util.*;

public class Deposito {
	
	//Creiamo un'array List che fungerà da deposito dei vari prodotti (Oggetto contenente le varie caratteristiche identificative.
	
	ArrayList<Prodotto> merce = new ArrayList<Prodotto>();
	
	

	
	


	public void setDepositoAggiungi(String tipo, String caratteristica, Double numero) {
		Prodotto e = new Prodotto(tipo,caratteristica,numero);
		merce.add(e);
	
	}

	public void setDepositoRimuovi(String tipo, String caratteristica, Double numero) {
		int x=0;
		Prodotto e = new Prodotto(tipo,caratteristica,numero);
		Iterator<Prodotto> i=merce.iterator();
		while(i.hasNext()) {
		//???????????????????????????''	
			if(e.equals(merce[x])) {
				
			}
		}
}
