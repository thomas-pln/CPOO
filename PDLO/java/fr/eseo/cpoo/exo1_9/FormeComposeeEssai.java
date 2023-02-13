package fr.eseo.cpoo.exo1_9;

public class FormeComposeeEssai {

        public static void main(String[] args) {
            Forme[] formes = new Forme[3];
            formes[0] = new Cercle(1);
            formes[1] = new Rectangle();
            formes[2] = new Cercle(4);
            FigureComposee figure = new FigureComposee(formes);
            System.out.println("Aire de la figure : " + figure.aire());
            System.out.println("Périmètre de la figure : " + figure.perimetre());
        }
}
