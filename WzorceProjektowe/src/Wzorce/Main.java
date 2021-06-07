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




