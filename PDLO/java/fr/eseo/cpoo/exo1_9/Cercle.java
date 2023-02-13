package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class Cercle extends Ellipse {

    public Cercle() {
        super();
        setLargeur(LARGEUR_PAR_DEFAUT);
        setHauteur(LARGEUR_PAR_DEFAUT);
    }

    public Cercle(Coordonnees position) {
        super();
        setPosition(position);
        setLargeur(LARGEUR_PAR_DEFAUT);
        setHauteur(LARGEUR_PAR_DEFAUT);
    }

    public Cercle(Coordonnees position, int cote) {
        super();
        setPosition(position);
        setLargeur(cote);
        setHauteur(cote);
    }

    public Cercle(int cote) {
        super();
        setLargeur(cote);
        setHauteur(cote);
    }

    public Cercle(int x, int y, int cote) {
        super();
        setPosition(new Coordonnees(x, y));
        setLargeur(cote);
        setHauteur(cote);
    }

    @Override
    public String toString() {
        return "[ Cercle ] pos : ( <" + getX() + "> , <" + getY() + ">) dim : <" + getLargeur() + "> x <" + getHauteur() + "> périmètre : <" + perimetre() + "> aire : <" + aire() + ">";
    }
}
