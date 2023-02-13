package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class Cercle extends Ellipse {

    public Cercle() {
        super();
        setLargeur(super.LARGEUR_PAR_DEFAUT);
        setHauteur(super.LARGEUR_PAR_DEFAUT);
    }

    public Cercle(Coordonnees position, int diam) {
        super(diam, diam, position);
    }

    public Cercle(int diam) {
        super(diam, diam);
    }

    public Cercle(int x, int y, int diam) {
        super(diam, diam, new Coordonnees(x, y));
    }

    public int getDiametre() {
        return this.getLargeur();
    }

    public void setDiametre(int diam) {
        this.setLargeur(diam);
        this.setHauteur(diam);
    }

    @Override
    public String toString() {
        return "[ Cercle ] pos : ( <" + getPos().getX() + "> , <" + getPos().getY() + ">) dim : <" + getLargeur() + "> x <" + getHauteur() + "> périmètre : <" + perimetre() + "> aire : <" + aire() + ">";
    }
}
