/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wzorce;

import java.util.Vector;

/**
 *
 * @author mk0czewsk11
 */
abstract class Element {
    protected String nazwa;
    
    public Element(String nazwa) {
        this.nazwa = nazwa;
    }
    
    public abstract void Dodaj(Element element);
    public abstract void Usun(Element element);
    public abstract void Pokaz(int poziom);
}

class Kompozyt extends Element { 
    private Vector<Element> elements = new Vector<Element>();

    public Kompozyt(String nazwa) {
        super(nazwa);
    }
    
    @Override
    public void Dodaj(Element element) {
        elements.add(element);
    }

    @Override
    public void Usun(Element element) {
        elements.remove(element);
    }

    @Override
    public void Pokaz(int poziom) {
        System.out.println("-" + String.valueOf(poziom) + "-" + nazwa);
        
        elements.forEach(element -> {
            element.Pokaz(poziom + 2);
        });
    }    
}

class Lisc extends Element {

    public Lisc(String nazwa) {
        super(nazwa);
    }

    @Override
    public void Dodaj(Element element) {
        System.out.println("Nie można dodać liścia");
    }

    @Override
    public void Usun(Element element) {
        System.out.println("Nie można usunąć liścia");
    }

    @Override
    public void Pokaz(int poziom) {
        System.out.println("-" + String.valueOf(poziom) + "-" + nazwa);
    }    
}
