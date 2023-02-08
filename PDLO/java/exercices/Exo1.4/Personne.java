class Personne {
    // Constantes de classe
    static final String NATIONALITE_PAR_DEFAUT = "française";
    // Variables de classe
    static int nbPersonnes;
    // Variables d ’instance
    String nom;
    String prenom;
    int anneeDeNaissance;
    String nationalite;

    // Méthodes
    // Accesseurs et Mutateurs
    String getNom() {
        return this.nom;
    }

    void setNom(String nom) {
        //affecte l ’argument " nom " à
        // son attribut " nom " ( this . nom )
        this.nom = nom;
    }

    String getPrenom() {
        return this.prenom;
    }

    void setPrenom(String prenom) {
        // affecte l’argument " prenom "
        // à son attribut " prenom " ( this . prenom )
        this.prenom = prenom;
    }

    int getAnneeDeNaissance() {
        return this.anneeDeNaissance;
    }

    void setAnneeDeNaissance(int anneeDeNaissance) {
        // affecte l’argument " anneeDeNaissance "
        // à son attribut
        // " anneeDeNaissance " ( this . anneeDeNaissance )
        this.anneeDeNaissance = anneeDeNaissance;
    }

    String getNationalite() {
        return this.nationalite;
    }

    void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }


    // Autres méthodes //
    // Méthodes de classe
    static int getNbPersonnes() {
        return nbPersonnes;
    }

    static void incrementeNbPersonnes() {
        nbPersonnes++;
    }

    // Méthodes d’instance
    int age(int annee) {
        // Retourne l’\^{ a} ge de la Personne l’annee donnée
        // le jour de son anniversaire .
        return annee - getAnneeDeNaissance();
    }

    public String identite(){
        return String.format("%s %s - Né(e): %2d Nationalité : %s", prenom, nom, anneeDeNaissance, nationalite );
    }
}