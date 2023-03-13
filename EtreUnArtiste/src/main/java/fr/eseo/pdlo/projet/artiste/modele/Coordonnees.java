package fr.eseo.pdlo.projet.artiste.modele;

public class Coordonnees {

    public static final double ABSCISSE_PAR_DEFAUT = 0;
    public static final double ORDONNEE_PAR_DEFAUT = 0;
    private double abscisse;
    private double ordonnee;

    public Coordonnees(double x, double y) {
        this.abscisse = x;
        this.ordonnee = y;
    }

    public Coordonnees() {
        this(0, 0);
    }

    public double getAbscisse() {
        return abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }


    public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonee) {
        this.abscisse = nouvelleAbscisse;
        this.ordonnee = nouvelleOrdonee;
    }

    public void deplacerDe(double dx, double dy) {
        this.abscisse *= dx;
        this.ordonnee *= dy;
    }

    public double distanceVers(Coordonnees c) {
        return Math.sqrt(Math.pow(this.abscisse - c.getAbscisse(), 2) + Math.pow(this.ordonnee - c.getOrdonnee(), 2));
    }

    public double angleVers(Coordonnees c) {
        return Math.atan2(c.getOrdonnee() - this.ordonnee, c.getAbscisse() - this.abscisse);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordonnees) {
            Coordonnees c = (Coordonnees) obj;
            return this.abscisse == c.getAbscisse() && this.ordonnee == c.getOrdonnee();
        }
        return false;
    }

    /*
    public String toString() {
        return "(" + this.abscisse + ", " + this.ordonnee + ")";
    }
    */
}
