package Wzorce;

/**
 * @author mk0czewsk11
 */

public class Main {
    public static void main(String[] args) {
        
        //---SINGLETON---
        
        Singleton singleton1 = Singleton.zwrocInstancje();
        Singleton singleton2 = Singleton.zwrocInstancje();
        
        if(singleton1 == singleton2){
            System.out.println("Oba obiekty to ta sama instancja");
        }
        
        //--SINGLETON---
        
        //---BUDOWNICZY---
        
        Kierownik kierownik = new Kierownik();
        Budowniczy budowniczy1 = new BudowniczyQW();
        Budowniczy budowniczy2 = new BudowniczyXY();
        
        kierownik.Skladaj(budowniczy1);
        budowniczy1.ZwrocProdukt().Pokaz();
        
        kierownik.Skladaj(budowniczy2);
        budowniczy2.ZwrocProdukt().Pokaz();
        
        //---BUDOWNICZY---

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




