package fr.eseo.cpoo.exo1_5;

public class Coordonnees {

    private int x;
    private int y;

    public Coordonnees(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordonnees() {
        this(0, 0);
    }

    public void deplacerVers(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplacerDe(int dx, int dy) {
        this.x *= dx;
        this.y *= dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int distanceVers(Coordonnees c){
        return (int) Math.sqrt(Math.pow(this.x - c.getX(), 2) + Math.pow(this.y - c.getY(), 2));
    }

    public int angleVers(Coordonnees c){
        return (int) Math.atan2(c.getY() - this.y, c.getX() - this.x);
    }
}
