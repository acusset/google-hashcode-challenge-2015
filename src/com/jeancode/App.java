package com.jeancode;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Antoine on 12/03/2015.
 */
public class App {

    private Parseur parseur;

    String chaine="";
    String fichier ="fichiertexte.txt";

    try{
        InputStream ips = new FileInputStream("dc.in");
        InputStreamReader ipsr=new InputStreamReader(ips);
        BufferedReader br=new BufferedReader(ipsr);
        String ligne;
        while ((ligne=br.readLine())!=null){
            System.out.println(ligne);
            chaine+=ligne+"\n";
        }
        br.close();
    }
    catch (Exception e){
        System.out.println(e.toString());
    }

}
