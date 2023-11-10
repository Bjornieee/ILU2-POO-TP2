package villagegaulois;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VillageTest {
    private Village village;
    @BeforeEach
    void setUp() {
        village = new Village("le village des irréductible gaulois",5,5);
        System.out.println("Initialisation...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("...Fin du test");
    }

    @Test
    void getNom() {
        assertEquals("le village des irréductible gaulois", village.getNom());
        assertNotEquals("le village inconnu", village.getNom());
    }

    @Test
    void setChef() {

    }

    @Test
    void ajouterHabitant() {

    }

    @Test
    void trouverHabitant() {
    }

    @Test
    void donnerVillageois() {
    }

    @Test
    void donnerNbEtal() {
    }

    @Test
    void installerVendeur() {
    }

    @Test
    void partirVendeur() {
    }

    @Test
    void rechercherEtalVide() {
    }

    @Test
    void rechercherVendeursProduit() {
    }

    @Test
    void rechercherEtal() {
    }

    @Test
    void donnerEtatMarche() {
    }
}