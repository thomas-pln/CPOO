package fr.eseo.cpoo.exo1_8;

import fr.eseo.cpoo.exo1_5.Coordonnees;
import fr.eseo.cpoo.exo1_5.Rectangle;

public class Carre extends Rectangle {

    public Carre() {
        super();
        setCote(super.LARGEUR_PAR_DEFAUT);
    }

    public Carre(Coordonnees position, int cote) {
        super(cote, cote, position);
    }

    public Carre(int cote) {
        super(cote, cote);
    }

    public Carre(int x, int y, int cote) {
        super(cote, cote, new Coordonnees(x, y));
    }

    public int getCote() {
        return this.getLargeur();
    }

    public void setCote(int cote) {
        this.setLargeur(cote);
        this.setHauteur(cote);
    }

    @Override
    public String toString() {
        return "[ Carre ] pos : ( <" + getOrigine().getX() + "> , <" + getOrigine().getY() + ">) dim : <" + getLargeur() + "> x <" + getHauteur() + "> périmètre : <" + perimetre() + "> aire : <" + aire() + ">";
    }


}
