package fr.eseo.cpoo.exo1_5;

public class Rectangle {

    protected static final int LARGEUR_PAR_DEFAUT = 1;
    private static final int HAUTEUR_PAR_DEFAUT = 1;
    private int largeur;
    private int hauteur;
    private Coordonnees origine;

    public Rectangle(int largeur, int hauteur, Coordonnees origine) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.origine = origine;
    }

    public Rectangle(int largeur, int hauteur) {
        this(largeur, hauteur, new Coordonnees());
    }

    public Rectangle() {
        this(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT, new Coordonnees());
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public Coordonnees getOrigine() {
        return origine;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setOrigine(Coordonnees origine) {
        this.origine = origine;
    }

    public int surface() {
        return largeur * hauteur;
    }

    public int perimetre() {
        return 2 * (largeur + hauteur);
    }

    public boolean estCarre() {
        return largeur == hauteur;
    }

    public void deplacerVers(Coordonnees c) {
        origine = c;
    }

    public void deplacerDe(int dx, int dy) {
        origine.deplacerDe(dx, dy);
    }

    public void deplacerVers(int x, int y) {
        origine.deplacerVers(x, y);
    }


    public void agrandir(int dx, int dy) {
        largeur += dx;
        hauteur += dy;
    }

    public boolean contient(Coordonnees c) {
        return c.getX() >= origine.getX() && c.getX() <= origine.getX() + largeur && c.getY() >= origine.getY() && c.getY() <= origine.getY() + hauteur;
    }

    public boolean contient(Rectangle r) {
        return contient(r.getOrigine()) && contient(new Coordonnees(r.getOrigine().getX() + r.getLargeur(), r.getOrigine().getY() + r.getHauteur()));
    }

    public boolean estDisjoint(Rectangle r) {
        return !contient(r) && !r.contient(this);
    }

    public boolean estEgal(Rectangle r) {
        return largeur == r.getLargeur() && hauteur == r.getHauteur();
    }

    public int aire() {
        return largeur * hauteur;
    }

    public String toString() {
        return "[ Rectangle ] pos : ( <" + origine.getX() + "> , <" + origine.getY() + ">) dim : <" + largeur + "> x <" + hauteur + "> périmètre : <" + perimetre() + "> aire : <" + aire() + ">";
    }
}
