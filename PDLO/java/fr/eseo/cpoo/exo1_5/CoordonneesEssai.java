package fr.eseo.cpoo.exo1_5;

public class CoordonneesEssai {
    public static void main(String[] args) {
        Coordonnees c1 = new Coordonnees(1, 1);
        Coordonnees c2 = new Coordonnees(2, 2);
        System.out.println(c1.distanceVers(c2));
        System.out.println(c1.angleVers(c2));
    }
}
