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
