public class PersonneEssai {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        p1.setNom("toto");
        p1.setPrenom("tata");
        p1.setAnneeDeNaissance(2000);
        p1.setNationalite("IR");
        Personne p2 = new Personne();
        p2.setNom("titi");
        p2.setPrenom("tutu");
        p2.setAnneeDeNaissance(2001);
        p2.setNationalite("FR");
        Personne p3 = new Personne();
        p3.setNom("tete");
        p3.setPrenom("tato");
        p3.setAnneeDeNaissance(2000);
        p3.setNationalite("ES");

        System.out.println(p1.identite());
        System.out.println(p2.identite());
        System.out.println(p3.identite());
    }
}
