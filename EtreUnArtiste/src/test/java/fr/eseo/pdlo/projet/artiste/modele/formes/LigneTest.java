package fr.eseo.pdlo.projet.artiste.modele.formes;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LigneTest {

    @Test
    public void testConstructeurVide() {
        Ligne ligne = new Ligne();
        assertThat(new Coordonnees(), ligne.getC1());
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
        assertEquals(new Coordonnees(10, 5), ligne.getC2());
    }

    @Test
    public void testGetC2() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(new Coordonnees(-10, -10), ligne.getC2());
    }

    @Test
    public void testGetC2LargeurNegative() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), -20, 15);
        assertEquals(new Coordonnees(30, -10), ligne.getC2());
    }

    @Test
    public void testGetC2HauteurNegative() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, -15);
        assertEquals(new Coordonnees(-10, 20), ligne.getC2());
    }

    @Test
    public void testGetC2LargeurHauteurNegative() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), -20, -15);
        assertEquals(new Coordonnees(30, 20), ligne.getC2());
    }

    @Test
    public void testDeplacerVers() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        ligne.deplacerVers(20, 10);
        assertEquals(new Coordonnees(20, 10), ligne.getC1());
        assertEquals(new Coordonnees(10, 5), ligne.getC2());
    }

    @Test
    public void testDeplacerDe() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        ligne.deplacerDe(20, 10);
        assertEquals(new Coordonnees(30, 15), ligne.getC1());
        assertEquals(new Coordonnees(20, 10), ligne.getC2());
    }

    @Test
    public void testPerimetre() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(25.0, ligne.perimetre());
    }

    @Test
    public void testAire() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(0.0, ligne.aire());
    }


    @Test
    public void testCadreMinX() {
        Ligne ligne = new Ligne(new Coordonnees(10, 5), 20, 15);
        assertEquals(10.0, ligne.getCadreMinX());
    }


}
