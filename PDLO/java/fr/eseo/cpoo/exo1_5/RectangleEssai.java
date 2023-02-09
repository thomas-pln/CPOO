package fr.eseo.cpoo.exo1_5;

public class RectangleEssai {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 1, new Coordonnees(1, 1));
        Rectangle r2 = new Rectangle(2, 2, new Coordonnees(2, 2));
        System.out.println(r1.contient(r2));
        System.out.println(r2.contient(r1));
        System.out.println(r1.estDisjoint(r2));
        System.out.println(r2.estDisjoint(r1));
    }
}
