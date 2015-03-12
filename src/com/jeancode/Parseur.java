package com.jeancode;

import java.io.*;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Parseur {

    private String fileName;
    private File file;

    public Parseur(String fileName) {
        this.fileName = fileName;
    }

    public boolean openFile() {

        this.file = new File(this.fileName);
        if (!this.file.exists())
            return false;

//        if (!this.file.exists()) {
//            System.out.println("Impossible d'ouvrir le fichier");
//            return false;
//        } else {
//            try {
//                int i = 1;
//                String chaine = "";
//                InputStream ips = new FileInputStream("dc.in");
//                InputStreamReader ipsr = new InputStreamReader(ips);
//                BufferedReader br = new BufferedReader(ipsr);
//                String ligne;
//                while ((ligne = br.readLine()) != null) {
//                    if (i == 1) {
//                        String[] split = ligne.split(" ");
//                        System.out.println(split);
//                    }
//                    System.out.println(ligne);
//                    chaine += ligne + "\n";
//                }
//                br.close();
//            } catch (FileNotFoundException e) {
//                System.out.println(e.getMessage());
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
        return true;
    }

    public boolean closeFile() {
//        this.file;
        return true;
    }

    @Override
    public String toString() {
        return "Salut";
    }
}
