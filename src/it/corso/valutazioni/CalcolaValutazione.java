package it.corso.valutazioni;

public class CalcolaValutazione {
	
	// attributi
	int idStudente;
	int percentualeAssenze;
	float mediaVoti;
	
	// costruttore
	CalcolaValutazione(int idStudente, int percentualeAssenze, float mediaVoti) {
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;		
	}
	
	// metodo 
	boolean esito() {
		boolean esito;
		if( percentualeAssenze > 50) {
			esito = false;
		} else if(percentualeAssenze > 25 && percentualeAssenze < 50 && mediaVoti > 2.0) {
			esito = true;
		} else if(percentualeAssenze <= 25 && mediaVoti >= 2.0) {
			esito = true;
		} else {
			esito = true;
		}
		return esito;
	}
}
