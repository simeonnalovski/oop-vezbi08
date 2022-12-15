package oop.fikt.vezbi08;

import java.util.HashMap;
import java.util.Map;

public class Rechnik {
    Map <String,String> Rechnik= new HashMap<String,String>(); // inicijalizacija na mapata recnik
    public void PolniMapa(){
        Rechnik.put("Bike","Velosiped");
        Rechnik.put("Car", "Avtomobil");
        Rechnik.put("Bus", "Avtobus");
        Rechnik.put("Train", "Voz");
        //metodot ja polni mapata so parovi od klucevi i vrednosti (angliski zborovi i makedonski prevod na istite)
    }
    public void Preveti(String s){
        if(Rechnik.containsKey(s)){
            System.out.println(Rechnik.get(s));
        }
        else{
            System.out.println("Ne postoi takov zbor vo recnikot");
        }
        // metotod Preveti bara vrednost (makedonski prevod) za klucot (stringot s)
    }
}
