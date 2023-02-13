package fr.eseo.cpoo.exo1_7;

import fr.eseo.cpoo.exo1_5.Rectangle;

import java.util.ArrayList;

public class PileDeRectangles {
    private ArrayList<Rectangle> lesRectangles;

    public PileDeRectangles() {
        lesRectangles = new ArrayList<Rectangle>();
    }

    public void empiler(Rectangle rectangle) {
        lesRectangles.add(rectangle);
    }

    public boolean estVide() {
        return lesRectangles.isEmpty();
    }

    public Rectangle depiler() {
        Rectangle rectangle = null;
        if (!estVide()) {
            rectangle = lesRectangles.get(lesRectangles.size() - 1);
            lesRectangles.remove(lesRectangles.size() - 1);
        }
        return rectangle;
    }

}
