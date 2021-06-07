package Wzorce;

import java.util.List;
import java.util.ArrayList;

/**
 * @author mk0czewsk11
 */

public class Main {
    
    //---DO PYŁKA---
    private static final String kolory[] = {"Czerwony", "Zielony", "Fioletowy", "Burgundowy", "Szary"};
    private static String pobierzLosowyKolor() {
          return kolory[(int)(Math.random()*kolory.length)];
       }
    //---DO PYŁKA---
    public static void main(String[] args) throws CloneNotSupportedException {
        
        //---SINGLETON---
        
        Singleton singleton1 = Singleton.zwrocInstancje();
        Singleton singleton2 = Singleton.zwrocInstancje();
        if(singleton1 == singleton2){
            System.out.println("Oba obiekty tej samej instancji");
        }

        //---SINGLETON---
        
        //---BUDOWNICZY---
        
        Kierownik kierownik = new Kierownik();
        Budowniczy budowniczy1 = new BudowniczyQW();
        Budowniczy budowniczy2 = new BudowniczyXY();
        
        kierownik.Skladaj(budowniczy1);
        budowniczy1.ZwrocProdukt().Pokaz();
        
        kierownik.Skladaj(budowniczy2);
        budowniczy2.ZwrocProdukt().Pokaz();
        
        //---BUDOWNICZY---
        
        //---FABRYKA---
        
        Komputer pc = KomputerFabryka.stworzKomputer("PC", "2 GB", "500 GB", "2.4 GHz");
        Komputer serwer = KomputerFabryka.stworzKomputer("Serwer", "32 GB", "2 TB", "3 GHz");
        
        System.out.println("Konfiguracja PC: "+pc);
	System.out.println("Konfiguracja Serwera: "+serwer);
        
        //---FABRYKA---
        
        //---FABRYKAABSTRAKCYJNA---
        
        KomputerA pcA = KomputerFabrykaA.zwrocKomputerA(new PCFabrykaAbstrakcyjna("1 GB","250 GB","2.1 GHz"));
	KomputerA serwerA = KomputerFabrykaA.zwrocKomputerA(new SerwerFabrykaAbstrakcyjna("32 GB","1 TB","3 GHz"));
		System.out.println("Konfiguracja PC (Abstrakcyjna):"+pcA);
		System.out.println("Konfiguracja Serwera (Abstrakcyjna):"+serwerA);
        
        //---FABRYKAABSTRAKCYJNA---
        
        //---PROTOTYP---
        
        Pracownicy prac = new Pracownicy();
	prac.zaladujDane();
		
	Pracownicy pracNowi = (Pracownicy) prac.clone();
	Pracownicy pracNowi2 = (Pracownicy) prac.clone();
	List<String> lista = pracNowi.zaladujPracListe();
	lista.add("Janek");
	List<String> lista1 = pracNowi2.zaladujPracListe();
	lista1.remove("Janusz");
		
	System.out.println("Pracownicy lista: "+prac.zaladujPracListe());
	System.out.println("PracNowi lista: "+lista);
	System.out.println("PracNowi2 lista: "+lista1);
        
        //---PROTOTYP---
        
        //---FASADA---
        
        Fasada fasada = new Fasada();

        fasada.MetodaA();
        fasada.MetodaB();
        
        //--FASADA---
        
        //---ADAPTER---
        
        ElementDocelowy elementDocelowy = new Adapter();
        elementDocelowy.MetodaA();
        
        //---ADAPTER---
        
        //---PYŁEK---
       
        for(int i=0; i<20; ++i) {
            WscieklyPtak wscieklyPtak = (WscieklyPtak)PtakFabryka.getWscieklyPtak(pobierzLosowyKolor());
            wscieklyPtak.rysuj();
        }
        
        //---PYŁEK---

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




