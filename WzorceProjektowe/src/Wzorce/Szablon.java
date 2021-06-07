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
abstract class Szablon {
    public abstract void Zapisz();
    public abstract void Wypisz();
    
    public void Wykonaj() {
        Zapisz();
        Wypisz();
        System.out.println("Koniec");
    }
}

class SzablonA extends Szablon {
    String str;
    
    public void Zapisz() {
        str = "ZapisA";
        System.out.println("Zapisuje");
    }

    public void Wypisz() {
        System.out.println("Zapisano: " + str);
    }
}

class SzablonB extends Szablon {
    String str;
    
    public void Zapisz() {
        str = "ZapisB";
        System.out.println("Zapisuje");
    }

    public void Wypisz() {
        System.out.println("Zapisano: " + str);
    }
}