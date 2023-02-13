package fr.eseo.cpoo.exo1_8;

public class EtudiantEssai {

        public static void main(String[] args) {
            Etudiant etudiant1 = new Etudiant("Dupont", "Jean", "française", 1990, 123456);
            Etudiant etudiant2 = new Etudiant("Durand", "1990", 654321);
            System.out.println(etudiant1);
            System.out.println(etudiant2);
        }
}
