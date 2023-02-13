package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class LigneEssai {

    public static void main(String[] args) {
        Ligne l1 = new Ligne();
        Ligne l2 = new Ligne(10, 20, 30, 40);
        Ligne l3 = new Ligne(new Coordonnees(10, 20), 30, 40);
        Ligne l4 = new Ligne(new Coordonnees(10, 20));
        Ligne l5 = new Ligne(30, 40);
        Ligne l6 = new Ligne(new Coordonnees(10, 20));
    }

}

