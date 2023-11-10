package controleur;

import org.junit.jupiter.api.*;
import personnages.Chef;
import villagegaulois.Village;

import static org.junit.jupiter.api.Assertions.*;

class ControlEmmenagerTest {

    private Chef abraracourcix;
    private Village village;
    private ControlEmmenager controlEmmenager;

    @BeforeEach
    void setUp() {
        System.out.println("Initialisation...");
        village = new Village("le village des irréductibles", 10, 5);
        abraracourcix = new Chef("abraracourcix",10, village);
        village.setChef(abraracourcix);
        controlEmmenager = new ControlEmmenager(village);

    }


    @Test
    void ajouterDruide() {
        assertFalse(controlEmmenager.isHabitant("Panoramix"));
    }

    @Test
    void ajouterGaulois() {
        assertFalse(controlEmmenager.isHabitant("Bonemine"));
        controlEmmenager.ajouterGaulois("Bonemine",3);
        assertTrue(controlEmmenager.isHabitant("Bonemine"));

    }
    @Test
    void isHabitant() {
        controlEmmenager.ajouterGaulois("Bonemine",3);
        assertTrue(controlEmmenager.isHabitant("Bonemine"));
        assertFalse(controlEmmenager.isHabitant("Existe pas"));
        controlEmmenager.ajouterDruide("Panoramix",10,1,5);
        assertTrue(controlEmmenager.isHabitant("Panoramix"));
    }
    @AfterEach
    void tearDown(){
        System.out.println("... Fin du test");
    }
}