package com.jeancode;

public class Main {

    public static void main(String[] args) {

        String file = "dc.in";
        Parseur parser = new Parseur(file);
        System.out.println(parser.openFile());

        parser.popule(new Datacenter());
    }
}

