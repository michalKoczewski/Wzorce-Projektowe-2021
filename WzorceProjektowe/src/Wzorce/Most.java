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
abstract class Most {
    public abstract void MostImplementacja();
}

class MostAbstrakcja {
    protected Most most;
    
    public void SetMost(Most most) {
        this.most = most;
    }
    
    public void MostImplementacja() {
        most.MostImplementacja();
    }
}

class MostAbstrakcjaPochodna extends MostAbstrakcja { 
    @Override
    public void MostImplementacja() {
        most.MostImplementacja();
    }
}

class SpecyficznyMost extends Most {
    @Override
    public void MostImplementacja() {
        System.out.print("SpecyficznyMost MostImplementacja");
    }
}

class InnyMost extends Most {
    @Override
    public void MostImplementacja() {
        System.out.print("InnyMost MostImplementacja");
    }           
}
