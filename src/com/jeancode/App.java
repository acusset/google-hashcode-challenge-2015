package com.jeancode;

import java.io.*;

/**
 * Created by Antoine on 12/03/2015.
 */
public class App {

    private Parseur parseur;

    public void lecture() {
        String chaine = "";
        String fichier = "com/jeancode/dc.in";
        int compteur;
        int nbRows;
        int nbCells;
        int nbOccupe;

        //lecture du fichier texte
        try {
            InputStream ips = new FileInputStream(fichier);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
                chaine += ligne + "\n";
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
