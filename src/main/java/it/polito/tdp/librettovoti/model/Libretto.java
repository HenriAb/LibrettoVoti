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
}
