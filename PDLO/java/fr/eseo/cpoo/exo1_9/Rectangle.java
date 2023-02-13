package fr.eseo.cpoo.exo1_9;

public class Rectangle extends Forme {


    public double perimetre() {
        return 2 * (getLargeur() + getHauteur());
    }

    public double aire() {
        return getLargeur() * getHauteur();
    }

    public String toString() {
        return "[ Rectangle ] pos : ( <" +getX() + "> , <" + getY() + ">) dim : <" + getLargeur() + "> x <" + getHauteur() + "> périmètre : <" + perimetre() + "> aire : <" + aire() + ">";
    }

}
