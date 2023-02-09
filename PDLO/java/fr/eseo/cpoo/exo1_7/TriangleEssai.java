package fr.eseo.cpoo.exo1_7;

public class TriangleEssai {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        triangle.setCotes(3, 3, 3);
        System.out.println(triangle);
        triangle.setCotes(3, 3, 4);
        System.out.println(triangle);
        triangle.setCotes(3, 4, 5);
        System.out.println(triangle);
        triangle.setCotes(3, 4, 6);
        System.out.println(triangle);
        triangle.setCotes(0, 4, 5);
        System.out.println(triangle);
    }
}
