package fr.eseo.cpoo.exo1_8;

import fr.eseo.cpoo.exo1_5.Personne;

public class Etudiant extends Personne {
    private int numEtudiant;

    public Etudiant(String nom, String prenom, String nationalite, int anneDeNaissance, int numEtudiant) {
        super(nom, prenom, nationalite, anneDeNaissance);
        this.numEtudiant = numEtudiant;
    }

    public Etudiant(String nom, String annneDeNaissance, int numEtudiant) {
        super(nom, annneDeNaissance);
        this.numEtudiant = numEtudiant;
    }

    public int getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    @Override
    public String toString() {
        return super.toString() + " ; NumEtudiant: " + this.numEtudiant;
    }
}
