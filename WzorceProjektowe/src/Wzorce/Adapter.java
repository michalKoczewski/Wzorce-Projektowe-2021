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
abstract class ElementDocelowy {
    public void MetodaA(){
        System.out.println("Wywołano ElementDocelowy MetodaA()");
    }
}

class Adaptowany {
    public void MetodaAdaptowanego() {
        System.out.println("Wywołano MoetodaAdaptowanego()");
    }
}

class Adapter extends ElementDocelowy {
    private Adaptowany _adaptowany = new Adaptowany();
    
    @Override
    public void MetodaA(){
        _adaptowany.MetodaAdaptowanego();
    }
}