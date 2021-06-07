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
        
        //---PELNOMOCNIK---
        
        Pelnomocnik p1 = new Pelnomocnik("zlehaslo");
        System.out.print(p1.PobierzDane());
        System.out.print("\n");
        Pelnomocnik p2 = new Pelnomocnik("zlehaslo");
        System.out.print(p2.PobierzDane());
        System.out.print("\n");
        
        //---PELNOMOCNIK---
    }
}




