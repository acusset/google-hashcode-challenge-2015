package com.jeancode;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Row {

    private int blocs;

    /*TODO ajouter un tableau de cellules*/

    public Row(int blocs) {
        this.blocs = blocs;
    }

    public int getBlocs() {

        return blocs;
    }

    public void setBlocs(int blocs) {
        this.blocs = blocs;
    }
}
