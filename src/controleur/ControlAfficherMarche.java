package controleur;

import villagegaulois.Village;

public class ControlAfficherMarche {
    private final Village village;

    public ControlAfficherMarche(Village village) {
        this.village = village;
    }

    public String[] donnerInfosMarche() {
        String[] marche = village.donnerEtatMarche();
        return marche;
    }
}
