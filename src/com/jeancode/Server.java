package com.jeancode;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Server implements Comparable {

    private int taille;
    private int capacite;
    private int groupe;
    private int ratio;
    private static int id;

    public Server(int taille, int capacite, int groupe) {

        this.taille = taille;
        this.capacite = capacite;
        this.groupe = groupe;
        this.ratio = capacite/taille;
        this.id ++;
    }

    public int getId() {
        return id;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    public int getRatio() {
        return ratio;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }


    @Override
    public int compareTo(Object o) {
        if(o instanceof Server) {
            Server server = (Server)o;
            if (server.getRatio() < this.ratio) {
                return -1;
            } else if (this.ratio == server.getRatio()) {
                return 0;
            } else {
                return 1;
            }

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Server{" +
                "taille=" + taille +
                ", capacite=" + capacite +
                ", groupe=" + groupe +
                '}';
    }
}
