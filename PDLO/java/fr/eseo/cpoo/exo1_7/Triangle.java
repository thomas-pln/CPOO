package fr.eseo.cpoo.exo1_7;

public class Triangle {
    private int coteA;
    private int coteB;
    private int coteC;

    public Triangle(int coteA, int coteB, int coteC) {
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }

    public int[] getCotes() {
        int[] cotes = {this.coteA, this.coteB, this.coteC};
        return cotes;
    }

    public void setCotes(int coteA, int coteB, int coteC) {
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }

    public TriangleType getType() {
        TriangleType type = TriangleType.NON_TRIANGLE;
        if (this.coteA > 0 && this.coteB > 0 && this.coteC > 0) {
            if (this.coteA == this.coteB && this.coteB == this.coteC) {
                type = TriangleType.EQUILATERAL;
            } else if (this.coteA == this.coteB || this.coteB == this.coteC || this.coteA == this.coteC) {
                type = TriangleType.ISOCELE;
            } else {
                type = TriangleType.SCALENE;
            }
        }
        return type;
    }

    public String toString() {
        TriangleType type = getType();
        if (type == TriangleType.NON_TRIANGLE) {
            return "Ceci n’est pas un triangle";
        }
    return "Triangle : " + type.toString();
    }
}
