/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wzorce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kubap
 */
class Produkt {
    List<String> _czesci = new ArrayList<String>();
    
    public void Uzupelnij(String czesc){
        _czesci.add(czesc);
    }
    
    public void Pokaz() {
        System.out.println("\nCzesci produktu ------");
        for(String czesc : _czesci){
        System.out.println(czesc);
    }
    }
}

public abstract class Budowniczy {

    public abstract void ZlozCzescA();
    public abstract void ZlozCzescB();
    public abstract Produkt ZwrocProdukt();
}

class BudowniczyXY extends Budowniczy {
    private Produkt _produkt = new Produkt();
    public void ZlozCzescA() {
        _produkt.Uzupelnij("Czesc X");
    }
    
    public void ZlozCzescB() {
        _produkt.Uzupelnij("Czesc Y");
    }
    
    public Produkt ZwrocProdukt() {
        return _produkt;
    }
}

class BudowniczyQW extends Budowniczy {
    private Produkt _produkt = new Produkt();
    public void ZlozCzescA() {
        _produkt.Uzupelnij("Czesc Q");
    }
    
    public void ZlozCzescB() {
        _produkt.Uzupelnij("Czesc W");
    }
    
    public Produkt ZwrocProdukt() {
        return _produkt;
    }
}

class Kierownik {
    public void Skladaj(Budowniczy budowniczy) {
        budowniczy.ZlozCzescA();
        budowniczy.ZlozCzescB();
    }
}
