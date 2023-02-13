package fr.eseo.cpoo.exo1_7;

import fr.eseo.cpoo.exo1_5.Rectangle;

public class PileDeRectanglesEssai {
    public static void main(String[] args) {
        PileDeRectangles pile = new PileDeRectangles();
        System.out.println("La pile est-elle vide ? " + pile.estVide());
        pile.empiler(new Rectangle(1, 2));
        pile.empiler(new Rectangle(3, 4));
        pile.empiler(new Rectangle(5, 6));
        pile.empiler(new Rectangle(7, 8));
        pile.empiler(new Rectangle(9, 10));
        System.out.println("La pile est-elle vide ? " + pile.estVide());
        System.out.println("Le rectangle dépilé est : " + pile.depiler().toString());
        System.out.println("Le rectangle dépilé est : " + pile.depiler().toString());
        System.out.println("Le rectangle dépilé est : " + pile.depiler().toString());
        System.out.println("La pile est-elle vide ? " + pile.estVide());
    }
}
