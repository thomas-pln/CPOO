package fr.eseo.pdlo.projet.artiste.modele.formes;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LigneTest {

    @Test
    public void testConstructeurVide() {
        Ligne ligne = new Ligne();
        assertEquals(new Coordonnees(), ligne.getC1());
        assertEquals(Ligne.LARGEUR_PAR_DEFAUT, ligne.getLargeur());
        assertEquals(Ligne.HAUTEUR_PAR_DEFAUT, ligne.getHauteur());
    }

    @Test
    public void testConstructeurCoordonnees() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5));
        assertEquals(new Coordonnees(10, 5), ligne.getC1());
        assertEquals(Ligne.LARGEUR_PAR_DEFAUT, ligne.getLargeur());
        assertEquals(Ligne.HAUTEUR_PAR_DEFAUT, ligne.getHauteur());
    }

    @Test
    public void testConstructeurCoordonneesLargeurHauteur() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(new Coordonnees(10, 5), ligne.getC1());
        assertEquals(20, ligne.getLargeur());
        assertEquals(15, ligne.getHauteur());
    }

    @Test
    public void testConstructeurLargeurHauteur() {
        Ligne ligne = new Ligne(20, 15);
        assertEquals(new Coordonnees(), ligne.getC1());
        assertEquals(20, ligne.getLargeur());
        assertEquals(15, ligne.getHauteur());
    }

    @Test
    public void testSetLargeur() {
        Ligne ligne = new Ligne();
        ligne.setLargeur(20);
        assertEquals(20, ligne.getLargeur());
    }

    @Test
    public void testSetHauteur() {
        Ligne ligne = new Ligne();
        ligne.setHauteur(20);
        assertEquals(20, ligne.getHauteur());
    }

    @Test
    public void testSetC1() {
        Ligne ligne = new Ligne();
        ligne.setC1(new Coordonnees(10, 5));
        assertEquals(new Coordonnees(10, 5), ligne.getC1());
    }

    @Test
    public void testSetC2() {
        Ligne ligne = new Ligne();
        ligne.setC2(new Coordonnees(10, 5));
        assertTrue(new Coordonnees(10, 5).equals(ligne.getC2()));
    }

    @Test
    public void testGetC2() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertTrue(new Coordonnees(30, 20).equals(ligne.getC2()));
    }

    @Test
    public void testGetC2LargeurNegative() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), -20, 15);
        assertTrue(new Coordonnees(-10, 20).equals(ligne.getC2()));
    }

    @Test
    public void testGetC2HauteurNegative() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, -15);
        assertTrue(new Coordonnees(30, -10).equals(ligne.getC2()));
    }

    @Test
    public void testGetC2LargeurHauteurNegative() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), -20, -15);
        assertTrue(new Coordonnees(-10, -10).equals(ligne.getC2()));
    }

    @Test
    public void testDeplacerVers() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        ligne.deplacerVers(20, 10);
        assertTrue(new Coordonnees(20, 10).equals(ligne.getC1()));
        assertTrue(new Coordonnees(40, 25).equals( ligne.getC2()));
    }

    @Test
    public void testDeplacerDe() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        ligne.deplacerDe(20, 10);
        assertTrue(new Coordonnees(200, 50).equals(ligne.getC1()));
        assertTrue(new Coordonnees(220, 65).equals(ligne.getC2()));
    }

    @Test
    public void testPerimetre() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(25, ligne.perimetre());
    }

    @Test
    public void testAire() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(0, ligne.aire());
    }


    @Test
    public void testCadreMinX() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(10.0, ligne.getCadreMinX());
    }

    @Test
    public void testCadreMinY() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(5.0, ligne.getCadreMinY());
    }

    @Test
    public void testCadreMaxX() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(30.0, ligne.getCadreMaxX());
    }

    @Test
    public void testCadreMaxY() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(20.0, ligne.getCadreMaxY());
    }

    @Test
    public void testSetPosition() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        ligne.setPosition(new Coordonnees(20, 10));
        assertTrue(new Coordonnees(20, 10).equals(ligne.getC1()));
        assertTrue(new Coordonnees(40, 25).equals( ligne.getC2()));
    }

}
