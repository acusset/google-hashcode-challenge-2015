package com.jeancode;

import java.io.*;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Parseur {

    private String fileName = "dc.in";
    private File file;

    public Parseur(String fileName) {
        this.fileName = fileName;
    }


    public boolean openFile() {
//
        this.file = new File(this.fileName);
        if (!this.file.exists())
            return false;
        return true;
    }

    public void readme() {
        try{
            BufferedReader buff = new BufferedReader(new FileReader(this.file));

            try {
                String line;
                while ((line = buff.readLine()) != null) {
                    System.out.println(line);
                    //TODO
                }
            } finally {
                buff.close();
            }
        } catch (IOException ioe) {
            System.out.println("Erreur --" + ioe.toString());
        }
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
