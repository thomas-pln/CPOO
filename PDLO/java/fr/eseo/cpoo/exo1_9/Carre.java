package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class Carre extends Rectangle {

    public Carre() {
        super();
        setLargeur(LARGEUR_PAR_DEFAUT);
        setHauteur(LARGEUR_PAR_DEFAUT);
    }

    public Carre(Coordonnees position) {
        super();
        setPosition(position);
        setLargeur(LARGEUR_PAR_DEFAUT);
        setHauteur(LARGEUR_PAR_DEFAUT);
    }

    public Carre(Coordonnees position, int cote) {
        super();
        setPosition(position);
        setLargeur(cote);
        setHauteur(cote);
    }

    public Carre(int cote) {
        super();
        setLargeur(cote);
        setHauteur(cote);
    }

    public Carre(int x, int y, int cote) {
        super();
        setPosition(new Coordonnees(x, y));
        setLargeur(cote);
        setHauteur(cote);
    }

    @Override
    public String toString() {
        return "[ Carre ] pos : ( <" + getX() + "> , <" + getY() + ">) dim : <" + getLargeur() + "> x <" + getHauteur() + "> périmètre : <" + perimetre() + "> aire : <" + aire() + ">";
    }


}
