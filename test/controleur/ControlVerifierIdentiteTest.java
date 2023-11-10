package controleur;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

import static org.junit.jupiter.api.Assertions.*;

class ControlVerifierIdentiteTest {

    private Chef abraracourcix;
    private Village village;
    private Gaulois bonemine;
    private ControlVerifierIdentite controlVerifierIdentite;

    @BeforeEach
    void setUp() {
        System.out.println("Initialisation...");
        village = new Village("le village des irréductibles", 10, 5);
        abraracourcix = new Chef("abraracourcix",10, village);
        village.setChef(abraracourcix);
        bonemine = new Gaulois("Bonemine",3);
        village.ajouterHabitant(bonemine);
        controlVerifierIdentite = new ControlVerifierIdentite(village);

    }

    @Test
    void verifierIdentite() {
        assertTrue(controlVerifierIdentite.verifierIdentite("abraracourcix"));
        assertFalse(controlVerifierIdentite.verifierIdentite("Inconnu"));
        assertTrue(controlVerifierIdentite.verifierIdentite("Bonemine"));


    }
    @AfterEach
    void tearDown(){
        System.out.println("... Fin du test");
    }
}