/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wzorce;

/**
 *
 * @author mk0czewsk11
 */
abstract class Folder {
    public abstract String PobierzDane(); 
}

class KonkretnyFolder extends Folder{     
    private final String Dane;

    public KonkretnyFolder(){
        System.out.print("KonkretnyPelnomocnik: Uruchomiony");
        Dane = "01000100 01000001 01001110 01000101" ;
    }
    
    @Override
    public String PobierzDane() {
        return Dane;
    }      
}

class Pelnomocnik extends Folder { 
    private KonkretnyFolder konkretnyFolder;
    private boolean autoryzowany;
    private String haslo = "dobrehaslo";
    
    public Pelnomocnik(String haslo) {
        if (haslo.equals(this.haslo)) {
            autoryzowany = true;
            System.out.print("Pelnomocnik: Uruchomiony");
        }
    }
    
    @Override
    public String PobierzDane() {
        if(autoryzowany) {
            if(konkretnyFolder == null) {
                konkretnyFolder = new KonkretnyFolder();
            }
            
            return "Dane z pełnomocnika to " + konkretnyFolder.PobierzDane();
        } else { 
            return "Pełnomocnik odmowa dostępu";
        }
    }
    
}