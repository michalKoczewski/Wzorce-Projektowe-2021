/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wzorce;

/**
 *
 * @author kubap
 */

import java.util.ArrayList;
import java.util.List;

 class Pracownicy implements Cloneable{

	private List<String> pracLista;
	
	public Pracownicy(){
		pracLista = new ArrayList<String>();
	}
	
	public Pracownicy(List<String> lista){
		this.pracLista=lista;
	}
	public void zaladujDane(){
		pracLista.add("Janusz");
		pracLista.add("Janek");
		pracLista.add("Jan");
		pracLista.add("Janina");
	}
	
	public List<String> zaladujPracListe() {
		return pracLista;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.zaladujPracListe()){
				temp.add(s);
			}
			return new Pracownicy(temp);
	}
	
}
