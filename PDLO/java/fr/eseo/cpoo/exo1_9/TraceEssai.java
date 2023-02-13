package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

public class TraceEssai {

    public static void main(String[] args) {
        Trace t1 = new Trace(new Coordonnees(10, 20), new Coordonnees(30, 40));
        Trace t2 = new Trace(new Coordonnees(10, 20), new Coordonnees(30, 40));
        Trace t3 = new Trace(new Coordonnees(10, 20), new Coordonnees(30, 40));
        Trace t4 = new Trace(new Coordonnees(10, 20), new Coordonnees(30, 40));
        Trace t5 = new Trace(new Coordonnees(10, 20), new Coordonnees(30, 40));
        Trace t6 = new Trace(new Coordonnees(10, 20), new Coordonnees(30, 40));

        t1.ajouterPoint(new Coordonnees(20, 30));
        t2.ajouterPoint(new Coordonnees(40, 50));
        t3.ajouterPoint(new Coordonnees(60, 70));
        t4.ajouterPoint(new Coordonnees(80, 90));
        t5.ajouterPoint(new Coordonnees(100, 110));
        t6.ajouterPoint(new Coordonnees(120, 130));
    }
}
