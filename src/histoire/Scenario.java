package histoire;

import controleur.*;
import frontiere.*;
import personnages.Chef;
import villagegaulois.Village;

public class Scenario {

    public static void main(String[] args) {
        Village village = new Village("le village des irréductibles", 10, 5);
        Chef abraracourcix = new Chef("Abraracourcix", 10, village);
        village.setChef(abraracourcix);

        ControlEmmenager controlEmmenager = new ControlEmmenager(village);
        ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(
                village);

        ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(
                village);
        ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(
                village);

        ControlPrendreEtal controlChercherEtal = new ControlPrendreEtal(
                controlVerifierIdentite, village);
        ControlLibererEtal controlLibererEtal = new ControlLibererEtal(
                controlTrouverEtalVendeur, village);
        ControlAcheterProduit controlAcheterProduit = new ControlAcheterProduit(
                controlVerifierIdentite, controlTrouverEtalVendeur, village);
        ControlAfficherMarche controlAfficherMarche = new ControlAfficherMarche(
                village);

        BoundaryEmmenager boundaryEmmenager = new BoundaryEmmenager(
                controlEmmenager);
        BoundaryAfficherVillage boundaryAfficherVillageois = new BoundaryAfficherVillage(
                controlAfficherVillage);

        BoundaryPrendreEtal boundaryChercherEtal = new BoundaryPrendreEtal(
                controlChercherEtal);
        BoundaryLibererEtal boundaryLibererEtal = new BoundaryLibererEtal(
                controlLibererEtal);
        BoundaryAcheterProduit boundaryAcheterProduit = new BoundaryAcheterProduit(
                controlAcheterProduit);
        BoundaryAfficherMarche boundaryAfficherMarche = new BoundaryAfficherMarche(
                controlAfficherMarche);
        BoundaryLeVillage boundaryLeVillage = new BoundaryLeVillage(
                boundaryAfficherVillageois, boundaryEmmenager,
                boundaryChercherEtal, boundaryLibererEtal,
                boundaryAfficherMarche, boundaryAcheterProduit);
        boundaryLeVillage.menu();
    }

}
