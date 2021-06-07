/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wzorce;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author kubap
 */
interface Ptak {
    public void rysuj();
}

class WscieklyPtak implements Ptak {
    private String kolor;
    
    public WscieklyPtak(String kolor){
        this.kolor = kolor;
    }
    
    @Override
    public void rysuj(){
        System.out.println("Wściekły ptak: rysuj() [Kolor : "+kolor);
    }
}

class PtakFabryka {
    private static final HashMap wscieklyPtakMapa = new HashMap();
    
    public static Ptak getWscieklyPtak(String kolor) {
        WscieklyPtak wscieklyPtak = (WscieklyPtak)wscieklyPtakMapa.get(kolor);
        
        if(wscieklyPtak == null){
            wscieklyPtak = new WscieklyPtak(kolor);
            wscieklyPtakMapa.put(kolor, wscieklyPtak);
            System.out.println("Tworzę wściekłego ptaka koloru: "+kolor);
        }
        return wscieklyPtak;
    }
}

