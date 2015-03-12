package com.jeancode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        String file = "dc.in";
        Parseur parser = new Parseur(file);
        System.out.println(parser.openFile());
        parser.readme();
//        parser.popule(datacenter);

        Datacenter datacenter = new Datacenter();
        ArrayList<Row> rows = datacenter.getRows();
        ArrayList<Server> servers = datacenter.getServer();
        Row row;

        while (rows.iterator().hasNext()) {
            //value is equal to a String value
            if( rows.iterator().next().equals(value)) {
                // do something
            }
        }
    }


}

