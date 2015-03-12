package com.jeancode;

import java.util.ArrayList;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Row {

    private int size;
    private ArrayList<Cell> cells;

    /*TODO ajouter un tableau de cellules*/

    public Row(int size) {
        this.size = size;
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }

    public boolean isCellOccupee (int i) {
        return cells.get(i).isOccupee();
    }

    public boolean isCellDisponnible (int i) {
        return cells.get(i).isDispo();
    }

    public boolean areNextCellsDispo (int i, int next) {
        boolean tmp = true;
        for (int j=0; i<next; j++) {
            if (cells.get(i).isDispo() == false) {
                return false;
            }
        }
        return tmp;
    }

    public boolean areNextCellsOccup (int i, int next) {
        boolean tmp = false;
        for (int j=0; i<next; j++) {
            if (cells.get(i).isOccupee() == true) {
                return true;
            }
        }
        return tmp;
    }

    public void remplirCell(int i) {
        if (!isCellOccupee(i)) {
            cells.get(i).setOccupee(true);
        }
    }

    public void remplirNextCell(int i, int next, int id) {
        if (!areNextCellsOccup(i,next)) {
            for (int j = 0; j < next; j++) {
                cells.get(i).setOccupee(true);
                cells.get(i).setServerID(id);
            }
        }
    }

    public boolean ajouteServer(int i, Server server) {
        int taille = server.getTaille();
        int serverid = server.getId();
        if (!areNextCellsOccup(i, taille) && !areNextCellsDispo(i, taille)) {
            remplirNextCell(i,taille, serverid);
            return true;
        } else {
            return false;
        }
    }

    public boolean ajouteRandomSer(Server server) {
        boolean tmp = false;
        int tailleRow = this.size;
        int serverid = server.getId();
        int taille = server.getTaille();
        for (int j=0; j<tailleRow-taille;j++) {
            if (!areNextCellsOccup(j, taille) && !areNextCellsDispo(j, taille)) {
                remplirNextCell(j,taille, serverid);
                tmp = true;
                break;
            } else {
                tmp = false;
            }
        }
        return tmp;
    }

    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "Row{" +
                "size=" + size +
                '}';
    }
}
