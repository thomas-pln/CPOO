package fr.eseo.cpoo.exo1_7;

import fr.eseo.cpoo.exo1_5.Personne;

import java.util.HashMap;

public class Annuaire {
    private HashMap<String, Personne> personnes;

    public Annuaire() {
        personnes = new HashMap<String, Personne>();
    }

    public void ajouter(Personne p) {personnes.put(p.getNom(), p);
    }

    public Personne chercher(String nom) {
        return personnes.get(nom);
    }

    public Personne supprimer(String nom) {
        return personnes.remove(nom);
    }

    public Personne[] versTableau() {
        return personnes.values().toArray(new Personne[personnes.size()]);
    }
}
