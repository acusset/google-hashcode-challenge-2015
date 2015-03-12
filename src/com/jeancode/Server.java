package com.jeancode;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Server {

    private int taille;
    private int capacite;
    private int groupe;

    public Server(int taille, int capacite, int groupe) {

        this.taille = taille;
        this.capacite = capacite;
        this.groupe = groupe;
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

    @Override
    public String toString() {
        return "Server{" +
                "taille=" + taille +
                ", capacite=" + capacite +
                ", groupe=" + groupe +
                '}';
    }
}
