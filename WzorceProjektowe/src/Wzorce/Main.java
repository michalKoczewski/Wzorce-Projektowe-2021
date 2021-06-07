package Wzorce;

/**
 * @author mk0czewsk11
 */

public class Main {
    public static void main(String[] args) {
        
        //---MOST---
        
        MostAbstrakcja m = new MostAbstrakcjaPochodna();
        m.most = new SpecyficznyMost();
        m.MostImplementacja();
        System.out.print("\n");
        m.most = new InnyMost();
        m.MostImplementacja();
        System.out.print("\n");
        
        //---MOST---
        
    }
}


//---MOST---START---

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

//---MOST---END---

//---PEŁNOMOCNIK---START---

abstract class Pelnomocnik {
    public abstract string PobierzDane(); 
}