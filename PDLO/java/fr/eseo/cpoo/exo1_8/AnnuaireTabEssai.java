package fr.eseo.cpoo.exo1_8;

import fr.eseo.cpoo.exo1_7.Annuaire;

public class AnnuaireTabEssai {

    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        annuaire.ajouter(new Professeur("Dupont", "Jean", 1980));
        annuaire.ajouter(new Professeur("Durand", "Pile"));
        annuaire.ajouter(new Etudiant("Dupont", "Jean", "française", 1990, 123456));
        annuaire.ajouter(new Etudiant("Durand", "1990", 654321));
        System.out.println(annuaire);
    }
}
