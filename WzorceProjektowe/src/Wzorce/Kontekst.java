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
class Kontekst {}

abstract class WyrazenieAbstrakcyjne {
    public abstract void Interpretuj(Kontekst kontekst);
}

class WyrazenieTerminalne extends WyrazenieAbstrakcyjne {
    @Override
    public void Interpretuj(Kontekst kontekst) {
        System.out.println("Wywołano WyrazenieTerminalne.Interpretuj()");
    }    
}

class WyrazenieNieTerminalne extends WyrazenieAbstrakcyjne {
    @Override
    public void Interpretuj(Kontekst kontekst) {
        System.out.println("Wywołano WyrażenieNieterminalne.Interpretuj()");
    }
    
}