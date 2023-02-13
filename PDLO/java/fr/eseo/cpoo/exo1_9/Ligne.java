package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class Ligne extends Forme {

    public Ligne() {
        super();
    }

    public Ligne(Coordonnees position, double largeur, double hauteur) {
        super(position, largeur, hauteur);
    }

    public Ligne(int x, int y, double largeur, double hauteur) {
        super(x, y, largeur, hauteur);
    }

    public Ligne(Coordonnees position) {
        super(position, Forme.LARGEUR_PAR_DEFAUT, Forme.HAUTEUR_PAR_DEFAUT);
    }

    public Ligne(double largeur, double hauteur) {
        super(largeur, hauteur);
    }

    public Coordonnees getC1() {
        return getPosition();
    }

    public Coordonnees getC2() {
        return new Coordonnees(getX() + (int) getLargeur(), getY() + (int) getHauteur());
    }

    public void setC1(Coordonnees c1) {
        setPosition(c1);
    }

    public void setC2(Coordonnees c2) {
        setLargeur(c2.getX() - getX());
        setHauteur(c2.getY() - getY());
    }

    public double getXMin() {
        return Math.min(getX(), getX() + (int) getLargeur());
    }

    public double getXMax() {
        return Math.max(getX(), getX() + (int) getLargeur());
    }

    public double getYMin() {
        return Math.min(getY(), getY() + (int) getHauteur());
    }

    public double getYMax() {
        return Math.max(getY(), getY() + (int) getHauteur());
    }

    public String toString() {
        return "[Ligne] p1 : ( <" + getC1().getX() + "> , <" + getC1().getY() + ">) , p2 : ( <" + getC2().getX() + "> , <" + getC1().getY() + ">) , longueur : <" + getLargeur() + " >";
    }

    @Override
    public double aire() {
        return 0;
    }

    @Override
    public double perimetre() {
        return getLargeur();
    }
}
