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
        m.most = new InnyMost();
        m.MostImplementacja();
        System.out.print("\n");        
        
        //---MOST---
        
        //---PELNOMOCNIK---
        
        Pelnomocnik p1 = new Pelnomocnik("zlehaslo");
        System.out.println(p1.PobierzDane());        
        Pelnomocnik p2 = new Pelnomocnik("dobrehaslo");
        System.out.println(p2.PobierzDane());
        System.out.print("\n");
        
        //---PELNOMOCNIK---
        
        //---KOMPOZYT---
        
        Kompozyt root = new Kompozyt("root");
        root.Dodaj(new Lisc("Lisc A"));
        root.Dodaj(new Lisc("Lisc B"));
        
        Kompozyt comp = new Kompozyt("Kompozyt X");
        comp.Dodaj(new Lisc("Lisc XA"));
        comp.Dodaj(new Lisc("Lisc XB"));
        
        root.Dodaj(comp);
        root.Dodaj(new Lisc("Lisc C"));
        
        Lisc leaf = new Lisc("Lisc D");
        root.Dodaj(leaf);
        root.Usun(leaf);
        
        root.Pokaz(1);
        System.out.print("\n");        
        
        
    }
}




