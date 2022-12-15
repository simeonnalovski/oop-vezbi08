package oop.fikt.vezbi08;

import java.util.HashMap;
import java.util.Map;

public class Main1{
    public static void main(String[] args){
        Map<String,String> Rechnik = new HashMap<String,String>();//kreiranje na mapa Rechnik
        Rechnik.put("book", "kniga");
        Rechnik.put("eraser", "guma za brisenje");
        Rechnik.put("notebook", "tetratka");
        Rechnik.put("hi", "zdravo");
        Rechnik.put("backpack", "ranec"); // polnenje na mapata
        System.out.println("Klucevi: "+Rechnik.keySet()); // pecatenje na klucevite
        System.out.println("Klucevi: "+Rechnik.values()); // pecatenje na vrednostite
        for(Map.Entry<String,String> entry : Rechnik.entrySet()){
            System.out.println(entry.getKey()+" | "+entry.getValue());
        } // pecatenje na site klucevi i vrednosti
        if(Rechnik.containsKey("hi")){
            System.out.println("Vrednosta (prevodot) za hi e: "+Rechnik.get("hi"));
        }else{
            System.out.println("Vo recnikot ne postoi zbor hi");
        }
        //proverka dali postoi klucot hi i pecatenje so pomos na Rechink.get()
    }
}