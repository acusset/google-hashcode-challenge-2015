package com.jeancode;

import java.io.File;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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

        Collections.sort(servers);

        System.out.println(servers);

        Iterator<Row> rowIterator = rows.iterator();
        Iterator<Server> serverIterator = servers.iterator();
        /* Déroule la solution */

        while (serverIterator.hasNext()) {
            Server server = serverIterator.next();
            Row row1;
            if (rowIterator.hasNext()) {
                row1 = rowIterator.next();
            } else {
                rowIterator = rows.iterator();
                row1 = rowIterator.next();
            }
            row1.ajouteRandomSer(server);
        }
        /* Normalement les serveurs sont triés */

        /* Ecriture de la solution */


    }


}

