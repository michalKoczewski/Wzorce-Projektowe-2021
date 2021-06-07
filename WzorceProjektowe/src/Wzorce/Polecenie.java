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
abstract class Polecenie {
    protected Odbiorca odbiorca;
    
    public Polecenie(Odbiorca odbiorca) {
        this.odbiorca = odbiorca;
    }
    
    public abstract void Wykonaj();
}

class SpecyficznePolecenie extends Polecenie {     
    public SpecyficznePolecenie(Odbiorca odbiorca) {
        super(odbiorca);
    }

    @Override
    public void Wykonaj() {
        odbiorca.Uruchom();
    }
}

class Odbiorca {
    public void Uruchom() {
        System.out.println("Wywołano Odbiorca.Uruchom()");
    }
}

class ObiektWywolujacy {
    private Polecenie polecenie;
    
    public void UstawPolecenie(Polecenie polecenie) {
        this.polecenie = polecenie;
    }
    
    public void WykonajPolecenie() {
        polecenie.Wykonaj();
    }
}