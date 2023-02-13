package fr.eseo.cpoo.exo1_8;

public class ProfesseurEssai {

        public static void main(String[] args) {
            Professeur professeur1 = new Professeur("Dupont", "Jean", 1980);
            Professeur professeur2 = new Professeur("Durand", "Pile");
            professeur1.ajouterCours("Java");
            professeur1.ajouterCours("C++");
            professeur2.ajouterCours("C");
            professeur2.ajouterCours("C#");
            System.out.println(professeur1);
            System.out.println(professeur2);
        }
}
