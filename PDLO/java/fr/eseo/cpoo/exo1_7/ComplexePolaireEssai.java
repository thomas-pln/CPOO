package fr.eseo.cpoo.exo1_7;

public class ComplexePolaireEssai {

    public static void main(String[] args) {
        ComplexePolaire c1 = new ComplexePolaire(1, 2);
        ComplexePolaire c2 = new ComplexePolaire(3, 4);
        ComplexePolaire c3 = c1.plus(c2);
        ComplexePolaire c4 = c1.fois(c2);
        c1.afficheInfo();
        c2.afficheInfo();
        c3.afficheInfo();
        c4.afficheInfo();
    }
}
