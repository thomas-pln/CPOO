package fr.eseo.cpoo.exo1_5;

public class PersonneEssai {
    public static void main(String[] args) {
        Personne p1 = new Personne("téta", "tata", "IR", 2000);
        Personne p2 = new Personne();
        p2.setNom("titi");
        p2.setPrenom("tutu");
        p2.setAnneeDeNaissance(2001);
        p2.setNationalite("FR");
        Personne p3 = new Personne("toto", "titi");

        System.out.println(p1.identite());
        System.out.println("p1 user: " + p1.userId());
        System.out.println(p2.identite());
        System.out.println("p2 user: " + p2.userId());
        System.out.println(p3.identite());
        System.out.println("p3 user: " + p3.userId());
        System.out.println("Nb personnes: " + Personne.getNbPersonnes());
    }
}
