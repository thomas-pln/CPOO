package fr.eseo.cpoo.exo1_7;

public class ComplexeEssai {

        public static void main(String[] args) {
            Complexe c1 = new Complexe(1, 2);
            Complexe c2 = new Complexe(3, 4);
            Complexe c3 = c1.addition(c2);
            Complexe c4 = c1.fois(c2);
            c1.afficheInfo();
            c2.afficheInfo();
            c3.afficheInfo();
            c4.afficheInfo();
        }
}
