package fr.eseo.cpoo.exo1_8;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class CercleEssai {

    public static void main(String[] args) {
        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle(10);
        Cercle c3 = new Cercle(10, 5, 20);
        Cercle c4 = new Cercle(10, 20, 30);
        Cercle c5 = new Cercle(new Coordonnees(10, 20), 30);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
