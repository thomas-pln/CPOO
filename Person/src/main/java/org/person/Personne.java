package org.person;

/**
 * 
 * @author Olivier Camp, ajout de bugs : Camille Constant
 *
 */
public class Personne {
	// Constantes de classe
	public static final String NATIONALITE_PAR_DEFAUT = "française";
	// Variables de classe
	public static int nbPersonnes;
	// Variables d'instance
	private String nom;
	private String prenom;
	private int anneeDeNaissance;
	private String nationalite;

	// Constructeurs

	public Personne() {
		this("???", "???");
	}

	public Personne(String prenom, String nom, String nationalite, int anneeDeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.anneeDeNaissance = anneeDeNaissance;
	}

	public Personne(String prenom, String nom) {
		this(prenom, nom, NATIONALITE_PAR_DEFAUT, 0);
	}

	public Personne(String prenom, String nom, int anneeDeNaissance) {
		this(prenom, nom, NATIONALITE_PAR_DEFAUT, anneeDeNaissance);
	}

	public Personne(String prenom, String nom, String nationalite) {
		this(prenom, nom, nationalite, 0);
	}

	// Methodes
	// Accesseurs et Mutateurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAnneeDeNaissance() {
		return anneeDeNaissance;
	}

	public void setAnneeDeNaissance(Integer anneeDeNaissance) {
		this.anneeDeNaissance = anneeDeNaissance;
	}

	public void setAnneeDeNaissance(int anneeDeNaissance) {
		this.anneeDeNaissance = anneeDeNaissance;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	// Autres Methodes

	public int age(int annee) {
		return annee - getAnneeDeNaissance().intValue();
	}

	public String identite() {
		return getPrenom() + " " + getNom() + " - " + "Annee de Naissance : " + getAnneeDeNaissance() + " Nationalite : "
				+ getNationalite();
	}

	protected String nettoyer(String nomOuPrenom) {
		/*
		 * Transforme les lettres majuscules de nomOuPrenom en minuscules, remplace les caractères accentues par leurs equivalents
		 * sans accents, supprime les espaces et les apostrophes et retourne la chaine de caractères resultante.
		 */
		nomOuPrenom = remplacerCarAccentues(nomOuPrenom);
		nomOuPrenom = nomOuPrenom.toLowerCase();
		nomOuPrenom = supprimerEspaces(nomOuPrenom);
		return nomOuPrenom;
	}

	protected String supprimerEspaces(String nomOuPrenom) {
		/*
		 * Supprime les espaces et les apostrophes de nomOuPrenom et retourne la chaine de caractères resultante.
		 */
		return nomOuPrenom.replaceAll(" ", "");
	}

	protected String remplacerCarAccentues(String nomOuPrenom) {
		/*
		 * Remplace les caractères accentues dans nomOuPrenom par leurs equivalents sans accents. et retourne la chaine de
		 * caractères resultante.
		 */
		nomOuPrenom = nomOuPrenom.replaceAll("[éèê]", "e");
		nomOuPrenom = nomOuPrenom.replaceAll("[âàä]", "a");
		nomOuPrenom = nomOuPrenom.replaceAll("[íïî]", "i");
		nomOuPrenom = nomOuPrenom.replaceAll("[ùü]", "u");

		return nomOuPrenom;
	}

	public String userId() {
		String uid;
		
		// Gestion du nom
		if (this.getNom() == null || this.getNom().isEmpty()) {
			uid = "???";			
		} else {
			String nom = nettoyer(getNom());
			uid = (nom.length() < 5 ? nom : nom.substring(0, 4));
		}
		
		// Gestion du prenom
		if (this.getPrenom() == null || this.getPrenom().isEmpty()) {
			uid = uid + "???";
		} else {
			String prenom = nettoyer(getPrenom());
			uid = uid + ((prenom.length() < 3) ? prenom : prenom.substring(0, 2));
		}

		// Gestion de l'annee de naissance
		if (this.getAnneeDeNaissance() == 0) {
			uid = uid + "XX";
		} else {
			int anneeDeNaissance = getAnneeDeNaissance();
			anneeDeNaissance = anneeDeNaissance % 100;
			
			uid = uid + anneeDeNaissance;
		}
		return uid;
	}


	public String toString() {
		return identite();
	}
}