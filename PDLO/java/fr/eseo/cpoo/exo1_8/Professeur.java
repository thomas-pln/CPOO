package fr.eseo.cpoo.exo1_8;

import fr.eseo.cpoo.exo1_5.Personne;

import java.util.ArrayList;
import java.util.List;

public class Professeur extends Personne {
    private ArrayList<String> cours;

    public Professeur(String nom, String nationalite, int annneDeNaissance) {
        super(nom, nationalite, annneDeNaissance);
    }

    public Professeur(String prenom, String non) {
        super(prenom, non);
    }

    public void ajouterCours(String cours) {
        this.cours.add(cours);
    }

    public List<String> getCours() {
        return this.cours;
    }

    public String toString() {
        return super.toString() + " ; Cours: " + this.cours;
    }
}
