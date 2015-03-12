package com.jeancode;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        String file = "dc.in";
        Parseur parser = new Parseur(file);
        System.out.println(parser.openFile());
        parser.readme();

        //parser.popule(new Datacenter());
    }
}

