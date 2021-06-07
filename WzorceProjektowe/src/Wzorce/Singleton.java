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
public class Singleton {

   private static Singleton INSTANCJA;
   
   private Singleton(){
   }
   
   public static Singleton zwrocInstancje() {
       if(INSTANCJA == null){
           INSTANCJA = new Singleton();
       }
       
       return INSTANCJA;
   }
}
