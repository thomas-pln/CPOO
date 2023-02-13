package fr.eseo.cpoo.exo1_9;

import fr.eseo.cpoo.exo1_5.Coordonnees;

import java.util.ArrayList;
import java.util.List;

public class Trace extends Forme {

    private ArrayList<Coordonnees> points = new ArrayList<Coordonnees>();

    public Trace(Coordonnees pos1, Coordonnees pos2) {
        super();
        points.add(pos1);
        points.add(pos2);
    }

    public List<Coordonnees> getPoints() {
        return points;
    }

    public void ajouterPoint(Coordonnees point) {
        points.add(point);
        int minX = getMinX();
        int minY = getMinY();
        int maxX = getMaxX();
        int maxY = getMaxY();
        setLargeur(maxX - minX);
        setHauteur(maxY - minY);
        deplacerVers(minX, maxY);
    }

    private int getMinX() {
        int minX = points.get(0).getX();
        for (Coordonnees point : points) {
            if (point.getX() < minX) {
                minX = point.getX();
            }
        }
        return minX;
    }

    private int getMinY() {
        int minY = points.get(0).getY();
        for (Coordonnees point : points) {
            if (point.getY() < minY) {
                minY = point.getY();
            }
        }
        return minY;
    }

    private int getMaxX() {
        int maxX = points.get(0).getX();
        for (Coordonnees point : points) {
            if (point.getX() > maxX) {
                maxX = point.getX();
            }
        }
        return maxX;
    }

    private int getMaxY() {
        int maxY = points.get(0).getY();
        for (Coordonnees point : points) {
            if (point.getY() > maxY) {
                maxY = point.getY();
            }
        }
        return maxY;
    }

    public void setX(double x) {
        setX(x);
    }

    public void setY(double y) {
        setY(y);
    }

    public void setPosition(Coordonnees position) {
        setPosition(position);
    }

    public void deplacerVers(double x, double y) {
        deplacerVers(x, y);
    }

    public void deplacerDe(double dx, double dy) {
        deplacerDe(dx, dy);
    }

    public void setLargeur(double largeur) {
        setLargeur(largeur);
    }

    public void setHauteur(double hauteur) {
        setHauteur(hauteur);
    }

    public String toString() {
        return "[Trace] pos : ( <"+getX()+"> , <"+getY()+">) dim : <"+getLargeur()+"> x <"+getHauteur()+"> longueur : <"+perimetre()+"> nbLignes : <"+(points.size()-1)+">";
    }

    @Override
    public double aire() {
        return 0;
    }

    @Override
    public double perimetre() {
        double perimetre = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimetre += points.get(i).distanceVers(points.get(i + 1));
        }
        return perimetre;
    }
}
