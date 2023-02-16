package fr.eseo.cpoo.exo1_7;

import fr.eseo.cpoo.exo1_5.Personne;

public class AnnuaireEssai {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        annuaire.ajouter( new Personne("Dupont", "Jean", 1980));
        annuaire.ajouter(new Personne("Durand", "Pile"));
        annuaire.ajouter(new Personne("Toto", "Tata", "française", 1990));
        System.out.println(annuaire.chercher("Tata").toString());
        annuaire.supprimer("Tata");
    }
}
