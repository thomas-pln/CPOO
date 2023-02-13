package fr.eseo.cpoo.exo1_7;

public class Complexe {
    private double reelle;
    private double imaginaire;

    public Complexe(double reelle, double imaginaire) {
        this.reelle = reelle;
        this.imaginaire = imaginaire;
    }

    /*
     * Si estPolaire == true
     * arg1 est le module et arg2 est l ’ argument
     * du complexe à cr é er
     * sinon
     * arg1 est la partie r é elle et
     * arg2 est la partie imaginaire
     * du complexe à cr é er
     */
    public Complexe(boolean estPolaire, double arg1, double arg2) {
        this.reelle = reelle;
        this.imaginaire = imaginaire;
    }

    public Complexe() {
        this(0, 0);
    }

    public double getReelle() {
        return reelle;
    }

    public double getImaginaire() {
        return imaginaire;
    }

    public void setReelle(double reelle) {
        this.reelle = reelle;
    }

    public void setImaginaire(double imaginaire) {
        this.imaginaire = imaginaire;
    }

    public double getModule() {
        return Math.sqrt(Math.pow(reelle, 2) + Math.pow(imaginaire, 2));
    }

    public double getArgument() {
        return Math.atan2(imaginaire, reelle);
    }

    public Complexe addition(Complexe c) {
        return new Complexe(reelle + c.getReelle(), imaginaire + c.getImaginaire());
    }

    public Complexe fois(Complexe c) {
        return new Complexe(reelle * c.getReelle() - imaginaire * c.getImaginaire(), reelle * c.getImaginaire() + imaginaire * c.getReelle());
    }

    public String formeCanonique() {
        return reelle + " + " + imaginaire + "i";
    }

    public void afficheInfo() {
        System.out.println("Module: " + getModule());
        System.out.println("Argument: " + getArgument());
        System.out.println("Forme canonique: " + formeCanonique());
    }
}
