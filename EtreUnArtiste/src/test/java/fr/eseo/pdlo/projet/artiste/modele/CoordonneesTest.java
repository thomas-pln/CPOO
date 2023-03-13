package fr.eseo.pdlo.projet.artiste.modele;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordonneesTest {


    @Test
    public void testConstructeur() {
        Coordonnees coordonnees = new Coordonnees(10, 5);
        assertEquals(10, coordonnees.getAbscisse());
        assertEquals(5, coordonnees.getOrdonnee());

        Coordonnees coordonnees2 = new Coordonnees();
        assertEquals(0, coordonnees2.getAbscisse());
        assertEquals(0, coordonnees2.getOrdonnee());
    }

    @Test
    public void testDeplacerVers() {
        Coordonnees coordonnees = new Coordonnees(0, 0);
        coordonnees.deplacerVers(1, 1);
        assertEquals(1, coordonnees.getAbscisse());
        assertEquals(1, coordonnees.getOrdonnee());
    }

    @Test
    public void testDeplacerDe() {
        Coordonnees coordonnees = new Coordonnees(2, 2);
        coordonnees.deplacerDe(2, 2);
        assertEquals(4, coordonnees.getAbscisse());
        assertEquals(4, coordonnees.getOrdonnee());
    }

    @Test
    public void testDistanceVers() {
        Coordonnees coordonnees = new Coordonnees(0, 0);
        assertEquals(1.4142135623730951, coordonnees.distanceVers(new Coordonnees(1, 1)));
    }

    @Test
    public void testAngleVers() {
        Coordonnees coordonnees = new Coordonnees(0, 0);
        assertEquals(0.7853981633974483, coordonnees.angleVers(new Coordonnees(1, 1)));
    }

}
