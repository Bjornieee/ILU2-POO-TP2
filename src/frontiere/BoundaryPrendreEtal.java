package frontiere;

import controleur.ControlPrendreEtal;

import java.util.Scanner;

public class BoundaryPrendreEtal {
    private final ControlPrendreEtal controlPrendreEtal;
    private final Scanner scan = new Scanner(System.in);

    public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
        this.controlPrendreEtal = controlChercherEtal;
    }

    public void prendreEtal(String nomVendeur) {
        StringBuilder chaine = new StringBuilder();
        if (!controlPrendreEtal.verifierIdentite(nomVendeur)) {
            chaine.append("Je suis désolé ");
            chaine.append(nomVendeur);
            chaine.append(" mais il faut être un habitant de notre village pour commencer ici.\n");
            System.out.println(chaine);
        } else {
            chaine.append("Bonjour ");
            chaine.append(nomVendeur);
            chaine.append(" je vais regarder si je peux vous trouver un étal.\n");
            if (!controlPrendreEtal.resteEtals()) {
                chaine.append("Désolé" + nomVendeur + "je n'ai plus d'étal qui ne soit pas déja occupé\n");
                System.out.println(chaine);
            } else {
                System.out.println(chaine);
                installerVendeur(nomVendeur);
            }
        }
    }

    private void installerVendeur(String nomVendeur) {
        Scanner scan = new Scanner(System.in);
        String chaine = "C'est parfait il me reste un étal pour vous !\n" +
                "Il me faudrait quelques renseignements :\n" +
                "Quels produits souhaitez vous vendre\n";
        System.out.println(chaine);
        String produit = scan.next();
        int nbProduit = Clavier.entrerEntier("Combien souhaitez vous en vendre ?\n");
        int iEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
        if (iEtal != -1) {
            System.out.println("Le vendeur " + nomVendeur + " s'est installé à l'étal n° " + iEtal + ".\n");
        }
    }
}
