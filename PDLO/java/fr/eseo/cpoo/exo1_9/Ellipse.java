package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class Ellipse extends Forme {

    private int largeur;

    private int hauteur;

    private Coordonnees pos;

    public Ellipse() {
        this.largeur = Ellipse.LARGEUR_PAR_DEFAUT;
        this.hauteur = Ellipse.HAUTEUR_PAR_DEFAUT;
        this.pos = new Coordonnees();
    }

    public Ellipse(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.pos = new Coordonnees();
    }

    public Ellipse(int largeur, int hauteur, Coordonnees pos) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.pos = pos;
    }

    public Ellipse(int largeur, int hauteur, int x, int y) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.pos = new Coordonnees(x, y);
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public Coordonnees getPos() {
        return pos;
    }

    public void setPos(Coordonnees pos) {
        this.pos = pos;
    }

    public int getY() {
        return this.pos.getY();
    }

    public int getX() {
        return this.pos.getX();
    }

    public void setY(int y) {
        this.pos.setY(y);
    }

    public void setX(int x) {
        this.pos.setX(x);
    }

    public void deplacerVers(int x, int y) {
        this.pos.deplacerVers(x, y);
    }

    public void deplacerDe(int dx, int dy) {
        this.pos.deplacerDe(dx, dy);
    }

    public double aire() {
        return Math.PI * this.largeur * this.hauteur;
    }

    public double perimetre() {
        return 2 * Math.PI * Math.sqrt((Math.pow(this.largeur, 2) + Math.pow(this.hauteur, 2)) / 2);
    }

    public String toString() {
        return "[ Ellipse ] pos : ( <" + pos.getX() + "> , <" + pos.getY() + ">) dim : <" + largeur + "> x <" + hauteur + "> périmètre : <" + perimetre() + "> aire : <" + aire() + ">";
    }


}
