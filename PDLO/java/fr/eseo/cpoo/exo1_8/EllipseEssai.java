package fr.eseo.cpoo.exo1_8;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class EllipseEssai {

    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse(2, 3);
        Ellipse ellipse3 = new Ellipse(2, 3, 4, 5);
        Ellipse ellipse4 = new Ellipse(2, 3, new Coordonnees(4, 5));

        System.out.println("ellipse1: " + ellipse1);
        System.out.println("ellipse2: " + ellipse2);
        System.out.println("ellipse3: " + ellipse3);
        System.out.println("ellipse4: " + ellipse4);
    }
}
