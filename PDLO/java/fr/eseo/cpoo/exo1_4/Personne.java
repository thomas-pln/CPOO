
package fr.eseo.cpoo.exo1_4;

import java.text.Normalizer;

public class Personne {
    // Constantes de classe
    private static final String NATIONALITE_PAR_DEFAUT = "française";
    // Variables de classe
    private static int nbPersonnes;
    // Variables d ’instance
    private String nom;
    private String prenom;
    private int anneeDeNaissance;
    private String nationalite;

    private String userId;

    // Méthodes
    // Accesseurs et Mutateurs
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        //affecte l ’argument " nom " à
        // son attribut " nom " ( this . nom )
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        // affecte l’argument " prenom "
        // à son attribut " prenom " ( this . prenom )
        this.prenom = prenom;
    }

    public int getAnneeDeNaissance() {
        return this.anneeDeNaissance;
    }

    public void setAnneeDeNaissance(int anneeDeNaissance) {
        // affecte l’argument " anneeDeNaissance "
        // à son attribut
        // " anneeDeNaissance " ( this . anneeDeNaissance )
        this.anneeDeNaissance = anneeDeNaissance;
    }

    public String getNationalite() {
        return this.nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }


    // Autres méthodes //
    // Méthodes de classe
    public static int getNbPersonnes() {
        return nbPersonnes;
    }

    public static void incrementeNbPersonnes() {
        nbPersonnes++;
    }

    // Méthodes d’instance
    public int age(int annee) {
        // Retourne l’\^{ a} ge de la Personne l’annee donnée
        // le jour de son anniversaire .
        return annee - getAnneeDeNaissance();
    }

    public String identite() {
        return String.format("%s %s - Né(e): %2d Nationalité : %s", prenom, nom, anneeDeNaissance, nationalite);
    }

    public String userId() {
        if (userId == null) {
            StringBuilder tmp = new StringBuilder();
            if (this.nom.length() > 5) tmp.append(nom, 0, 4);
            else tmp.append(nom);

            if (this.prenom.length() > 3) tmp.append(prenom, 0, 3);
            else tmp.append(prenom);

            tmp.append(Integer.toString(anneeDeNaissance), 2, 4);

            tmp = new StringBuilder(Normalizer.normalize(tmp, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("[^a-zA-Z0-9]", ""));

            userId = tmp.toString().trim();
        }
        return userId;
    }
}
