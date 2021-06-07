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
class PodSystemPierwszy {
    public void MetodaPierwsza() {
        System.out.println("PodsystemPierwszy Metoda");
    }
}

class PodSystemDrugi {
    public void MetodaDruga() {
        System.out.println("PodsystemDrugi Metoda");
    }
}

class PodSystemTrzeci{
    public void MetodaTrzecia() {
        System.out.println("PodsystemTrzeci Metoda");
    }
}

class PodSystemCzwarty {
    public void MetodaCzwarta() {
        System.out.println("PodsystemCzwarty Metoda");
    }
}

class Fasada {
    private PodSystemPierwszy _jeden;
    private PodSystemDrugi _dwa;
    private PodSystemTrzeci _trzy;
    private PodSystemCzwarty _cztery;
    
    public Fasada() {
        _jeden = new PodSystemPierwszy();
        _dwa = new PodSystemDrugi();
        _trzy = new PodSystemTrzeci();
        _cztery = new PodSystemCzwarty();
    }
    
    public void MetodaA() {
        System.out.println("\nMetodaA() ------ ");
        _jeden.MetodaPierwsza();
        _dwa.MetodaDruga();
        _trzy.MetodaTrzecia();
    }
    
    public void MetodaB()
    {
        System.out.println("\nMetodaB() ------ ");
        _dwa.MetodaDruga();
        _cztery.MetodaCzwarta();
    }
}