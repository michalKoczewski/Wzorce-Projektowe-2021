package Wzorce;

import java.util.ArrayList;

/**
 * @author mk0czewsk11
 */

public class Main {
    public static void main(String[] args) {
        
        //---MOST---Most.java
        
        MostAbstrakcja m = new MostAbstrakcjaPochodna();
        m.most = new SpecyficznyMost();
        m.MostImplementacja();        
        m.most = new InnyMost();
        m.MostImplementacja();
        System.out.print("\n");        
        
        //---MOST---
        
        //---PELNOMOCNIK---Folder.java
        
        Pelnomocnik p1 = new Pelnomocnik("zlehaslo");
        System.out.println(p1.PobierzDane());        
        Pelnomocnik p2 = new Pelnomocnik("dobrehaslo");
        System.out.println(p2.PobierzDane());
        System.out.print("\n");
        
        //---PELNOMOCNIK---
        
        //---KOMPOZYT---Element.java
        
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
        
        //---KOMPOZYT---
        
        //---METODA_SZABLONOWA---Szablon.java
        
        Szablon sA = new SzablonA();
        Szablon sB = new SzablonB();
        
        sA.Wykonaj();
        sB.Wykonaj();
        
        System.out.print("\n");
        
        //---METODA_SZABLONOWA---
        
        //---OBSERWATOR---Obserwator.java
        
        SpecyficznyObserwowany s = new SpecyficznyObserwowany();
        
        s.DodajObserwatora(new SpecyficznyObserwator(s, "X"));
        s.DodajObserwatora(new SpecyficznyObserwator(s, "Y"));
        s.DodajObserwatora(new SpecyficznyObserwator(s, "Z"));
        
        s.StanObserwowanego = "ABC";        
        
        s.Powiadom();
        
        System.out.print("\n");        
        
        //---OBSERWATOR---
        
        //---POLECENIE---Polecenie.java
        
        Odbiorca odbiorca = new Odbiorca();
        Polecenie polecenie = new SpecyficznePolecenie(odbiorca);
        ObiektWywolujacy wywolujacy = new ObiektWywolujacy();
        
        wywolujacy.UstawPolecenie(polecenie);
        wywolujacy.WykonajPolecenie();
        
        System.out.println("\n");
        
        //---POLECENIE
        
        //---INTERPRETER---Kontekst.java
        
        Kontekst kontekst = new Kontekst();
        WyrazenieAbstrakcyjne wyrazenie;
        
        wyrazenie = new WyrazenieTerminalne();
        wyrazenie.Interpretuj(kontekst);
        wyrazenie = new WyrazenieNieTerminalne();
        wyrazenie.Interpretuj(kontekst);
        wyrazenie = new WyrazenieTerminalne();
        wyrazenie.Interpretuj(kontekst);
        
        System.out.println("\n");
        
        //---INTERPRETER---
    }
}




