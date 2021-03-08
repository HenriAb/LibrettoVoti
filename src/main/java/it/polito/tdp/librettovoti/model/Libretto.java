package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>(); //cosi ho la specifica di che tipo di lista ho SOLO IN UN PUNTO
	}

	public void add(Voto v) { //con questa implementazione posso fare tutti i controlli che voglio
		
		this.voti.add(v); 
		
	}

	public String toString() {
		String res = "";
		for(Voto v : this.voti) {
			res += v.toString() + "\n";
		}
		return res;
	}
	/* NO GOOD
	public void stampaVotiUguali(int punteggio) {
		//il libretto stampa da solo i voti
		System.out.println();
	}
	
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sara poi il chiamante a stamparli
	} */
	
	public List<Voto> listaVotiUguali(int punteggio){ //espongo a esterno cosa sto usando 
		//restituisce solo i voti uguali al criterio
		
		List<Voto> risultato = new ArrayList<>();
		for(Voto v : this.voti) {
			if(v.getVoto() == punteggio) {
				risultato.add(v); //stesso oggetto punta a due liste diverse
			}
		}
		return risultato;
	}
	
	//e' modo migliore TO DO
	public Libretto votiUguali(int punteggio) { // ti do un libretto in cui ho filtrato i dati che mi servono
	
		Libretto risultato = new Libretto();
		for(Voto v : this.voti) {
			if(v.getVoto() == punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
}
