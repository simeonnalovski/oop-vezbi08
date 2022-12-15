package oop.fikt.vezbi08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args){
        try{
           InputStreamReader in = new InputStreamReader(System.in); //kreiranje na objekt od klasa inputstreamreader, so koj se cita od konzola
            BufferedReader br= new BufferedReader(in); // kreiranje na bufferedreader vrz objektot in
            String s= br.readLine(); //citanje na sleden red od konzola
            Rechnik r = new Rechnik(); 
            r.PolniMapa();
            r.Preveti(s);//kreiranje na recnik i povikuvanje na negovite metodi
            br.close();//zatvoranje na bufferedreader
        
    }
    catch(IOException e){
        System.out.println(e.toString()); // pecatenje na eventualno pojaveniot exception
    }
    
}
}