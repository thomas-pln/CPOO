package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class Ellipse extends Forme {

    public double aire() {
        return Math.PI * getLargeur() * getHauteur();
    }

    public double perimetre() {
        return 2 * Math.PI * Math.sqrt((Math.pow(getLargeur(), 2) + Math.pow(getHauteur(), 2)) / 2);
    }

    public String toString() {
        return "[ Ellipse ] pos : ( <" + getX() + "> , <" + getY() + ">) dim : <" + getLargeur() + "> x <" + getHauteur() + "> périmètre : <" + perimetre() + "> aire : <" + aire() + ">";
    }


}
