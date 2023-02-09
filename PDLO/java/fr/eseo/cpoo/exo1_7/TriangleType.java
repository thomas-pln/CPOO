package fr.eseo.cpoo.exo1_7;


public enum TriangleType {
    SCALENE("Scalène"),
    ISOCELE("Isocèle"),
    EQUILATERAL("Equilatéral"),
    NON_TRIANGLE("Non triangle");
    private String typeTriangle;

    private TriangleType(String typeTriangle) {
        this.typeTriangle = typeTriangle;
    }

    @Override
    public String toString() {
        return this.typeTriangle;
    }
}
