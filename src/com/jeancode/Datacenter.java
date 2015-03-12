package com.jeancode;

import java.util.ArrayList;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Datacenter {

    private ArrayList<Row> rows;
    private ArrayList<Server> server = new ArrayList<Server>();


    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }

    public ArrayList<Server> getServer() {
        return server;
    }

    public void setServer(ArrayList<Server> server) {
        this.server = server;
    }

    public Datacenter() {
        this.rows = new ArrayList<Row>();

        this.server = new ArrayList<Server>();
    }

    public Row getRow(int i) {
        return this.rows.get(i);
    }

    public Server getServer(int i) {
        return this.server.get(i);
    }

    public void setRow(int i, Row row) {
        this.rows.set(i, row);
    }

    public void setServer(int i, Server server) {
        this.server.get(i, server);
    }
}
