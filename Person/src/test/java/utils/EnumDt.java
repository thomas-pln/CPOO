package utils;

public enum EnumDt {
    //Cas nominal
    DT_1("Richard", "Stallman",  1953, "stallric53"),
    //Longeur nom
    DT_2("Steve", "Jobs", 1955, "jobsste55"),
    DT_3("Bill", "Gates",  1955, "gatesbil55"),
    DT_4("john","",1955, "john???55");

    public String prenom;
    public String nom;
    public String idAttendu;

    public int anneeDeNaissance;

    private EnumDt(String prenom, String nom, int anneeDeNaissance, String idAttendu) {
        this.prenom = prenom;
        this.nom = nom;
        this.anneeDeNaissance = anneeDeNaissance;
        this.idAttendu = idAttendu;
    }

}