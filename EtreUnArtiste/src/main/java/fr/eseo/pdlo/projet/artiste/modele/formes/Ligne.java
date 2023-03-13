package fr.eseo.pdlo.projet.artiste.modele.formes;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class Ligne {
    public static final double LARGEUR_PAR_DEFAUT = 5;
    public static final double HAUTEUR_PAR_DEFAUT = 5;

    private Coordonnees position;
    private double largeur;
    private double hauteur;

    public Ligne() {
        this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
    }

    public Ligne(Coordonnees coordonnees, double largeur, double hauteur) {
        this.position = coordonnees;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Ligne(Coordonnees coordonnees) {
        this(coordonnees, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
    }

    public Ligne(double largeur, double hauteur) {
        this(new Coordonnees(), largeur, hauteur);
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public Coordonnees getC1() {
        return this.position;
    }

    public Coordonnees getC2() {
        return new Coordonnees(this.getC1().getAbscisse() + this.getLargeur(), this.getC1().getOrdonnee() + this.getHauteur());
    }

    public void setC1(Coordonnees c1) {
        this.position = c1;
    }

    public void setC2(Coordonnees c2) {
        if (c2.getAbscisse() > this.getC1().getAbscisse()) {
            this.setLargeur(c2.getAbscisse() - this.getC1().getAbscisse());
        } else {
            this.setLargeur(this.getC1().getAbscisse() - c2.getAbscisse());
        }
        if (c2.getOrdonnee() > this.getC1().getOrdonnee()) {
            this.setHauteur(c2.getOrdonnee() - this.getC1().getOrdonnee());
        } else {
            this.setHauteur(this.getC1().getOrdonnee() - c2.getOrdonnee());
        }
    }

    public void setPosition(Coordonnees position) {
        this.position = position;
    }

    public double getCadreMinX() {
        return Math.abs(Math.min(this.getC1().getAbscisse(), this.getC2().getAbscisse()));
    }

    public double getCadreMinY() {
        return Math.abs(Math.min(this.getC1().getOrdonnee(), this.getC2().getOrdonnee()));
    }

    public double getCadreMaxX() {
        return Math.abs(Math.max(this.getC1().getAbscisse(), this.getC2().getAbscisse()));
    }

    public double getCadreMaxY() {
        return Math.abs(Math.max(this.getC1().getOrdonnee(), this.getC2().getOrdonnee()));
    }

    public void deplacerVers(double x, double y) {
        this.getC1().deplacerVers(x, y);
        this.getC2().deplacerVers(x + this.getLargeur(), y + this.getHauteur());
    }

    public void deplacerDe(double dx, double dy) {
        this.getC1().deplacerDe(dx, dy);
        this.getC2().deplacerDe(dx, dy);
    }

    public double perimetre() {
        return getC1().distanceVers(getC2());
    }

    public double aire() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ligne) {
            Ligne ligne = (Ligne) obj;
            return this.getC1().equals(ligne.getC1()) && this.getLargeur() == ligne.getLargeur() && this.getHauteur() == ligne.getHauteur();
        }
        return false;
    }
}
