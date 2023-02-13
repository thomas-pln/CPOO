package fr.eseo.cpoo.exo1_7;

import fr.eseo.cpoo.exo1_5.Personne;

import java.util.ArrayList;

public class Annuaire {
    private ArrayList<Personne> personnes;

    public Annuaire() {
        personnes = new ArrayList<Personne>();
    }

    public void ajouter(Personne p) {
        personnes.add(p);
    }

    public Personne chercher(String nom) {
        for (Personne p : personnes) {
            if (p.getNom().equals(nom)) {
                return p;
            }
        }
        return null;
    }

    public Personne supprimer(String nom) {
        Personne p = chercher(nom);
        if (p != null) {
            personnes.remove(p);
        }
        return p;
    }

    public Personne[] versTableau() {
        return personnes.toArray(new Personne[personnes.size()]);
    }
}
