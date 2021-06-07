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
   
    public static void main(String args[]) {
        
        Singleton singleton1 = Singleton.zwrocInstancje();
        Singleton singleton2 = Singleton.zwrocInstancje();
        
        if(singleton1 == singleton2){
            System.out.println("Oba obiekty to ta sama instancja");
        }
    }
}
