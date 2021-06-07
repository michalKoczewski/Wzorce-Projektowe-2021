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
 * @author mk0czewsk11
 */
abstract class Obserwator {
    public abstract void Aktualizuj();
}

abstract class Obserwowany {
    private List<Obserwator> detektywi = new ArrayList<Obserwator>();
    
    public void DodajObserwatora(Obserwator detektyw) {
        detektywi.add(detektyw);
    }
    
    public void UsunObserwatora(Obserwator detektyw) {
        detektywi.remove(detektyw);
    }
    
    public void Powiadom() {
        for (Obserwator d : detektywi) {
            d.Aktualizuj();
        }
    }
}

class SpecyficznyObserwowany extends Obserwowany {
    public String StanObserwowanego;
    
    public String getName() { return this.StanObserwowanego; }
    public void setName(String stanObserwowanego ) { this.StanObserwowanego = stanObserwowanego; }   
}

class SpecyficznyObserwator extends Obserwator {
    private String nazwa;
    private String obserwatorStan;
    public SpecyficznyObserwowany Obserwowany;
    
    public SpecyficznyObserwator(SpecyficznyObserwowany obserwowany, String nazwa) {
        this.Obserwowany = obserwowany;
        this.nazwa = nazwa;
    }
    
    @Override
    public void Aktualizuj() {
        obserwatorStan = Obserwowany.StanObserwowanego;
        System.out.println("Obserwator " + nazwa + " ma stan o wartości " + obserwatorStan);
    }
    
} 