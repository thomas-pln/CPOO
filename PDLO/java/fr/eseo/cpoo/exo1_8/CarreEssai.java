package fr.eseo.cpoo.exo1_8;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class CarreEssai {

        public static void main(String[] args) {
            Carre carre1 = new Carre();
            System.out.println(carre1);
            Carre carre2 = new Carre(2);
            System.out.println(carre2);
            Carre carre3 = new Carre(3, 4, 5);
            System.out.println(carre3);
            Carre carre4 = new Carre(new Coordonnees(6, 7), 8);
            System.out.println(carre4);
        }
}
