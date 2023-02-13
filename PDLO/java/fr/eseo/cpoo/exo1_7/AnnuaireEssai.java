package fr.eseo.cpoo.exo1_7;

import fr.eseo.cpoo.exo1_5.Personne;

public class AnnuaireEssai {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        annuaire.ajouter(new Personne("Jean", "Jaurèss"));
        annuaire.ajouter(new Personne("Jacque", "Dupont", "française", 1980));
        annuaire.ajouter(new Personne("Pierre", "Dante", "française", 1980));
        annuaire.ajouter(new Personne("Jeanne", "Martin", "irish", 2000));
        annuaire.ajouter(new Personne("Henri", "Brell", "française", 1968));
        annuaire.supprimer("Dupont");
        annuaire.ajouter(new Personne("Phillipe", "Dupont", "française", 1980));
        System.out.println(annuaire.chercher("Brell").identite());
        System.out.println(annuaire.chercher("NaN"));
    }
}
