/**
 * Created by Antoine on 12/03/2015.
 */
public class Cellule {

    private boolean dispo;
    private boolean occupee;

    public Cellule(boolean dispo, boolean occupee) {
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



}
