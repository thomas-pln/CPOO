package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public abstract class Forme {

    protected static final int LARGEUR_PAR_DEFAUT = 1;

    protected static final int HAUTEUR_PAR_DEFAUT = 1;

    private double largeur;
    private double hauteur;

    private Coordonnees position;


    public Forme() {
        this.position = new Coordonnees();
        this.largeur = Forme.LARGEUR_PAR_DEFAUT;
        this.hauteur = Forme.HAUTEUR_PAR_DEFAUT;
    }

    Forme(Coordonnees position, double largeur, double hauteur) {
        this.position = position;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    Forme(int x, int y, double largeur,double hauteur){
        this.position = new Coordonnees(x,y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    Forme(double largeur,  double hauteur){
        this.position = new Coordonnees();
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Coordonnees getPosition() {
        return position;
    }

    public void setPosition(Coordonnees position) {
        this.position = position;
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

    public int getY() {
        return position.getY();
    }

    public int getX() {
        return position.getX();
    }

    public void setX(int x) {
        position.setX(x);
    }

    public void setY(int y) {
        position.setY(y);
    }

    public void deplacerVers(int x, int y) {
        position.setX(x);
        position.setY(y);
    }

    public void deplacerDe(int dx, int dy) {
        position.setX(position.getX() + dx);
        position.setY(position.getY() + dy);
    }

    public abstract double aire();

    public abstract double perimetre();
}
