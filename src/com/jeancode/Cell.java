package com.jeancode;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Cell {

    private boolean dispo;
    private boolean occupee;
    private int serverID;

    public int getServerID() {
        return serverID;
    }

    public void setServerID(int serverID) {
        this.serverID = serverID;
    }

    public Cell(boolean dispo, boolean occupee) {
        this.dispo = dispo;
        this.occupee = occupee;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public boolean isOccupee() {
        return occupee;
    }

    public void setOccupee(boolean occupee) {
        this.occupee = occupee;
    }

    @Override
    public String toString() {
        return "com.jeancode.Cell{" +
                "dispo=" + dispo +
                ", occupee=" + occupee +
                '}';
    }
}
