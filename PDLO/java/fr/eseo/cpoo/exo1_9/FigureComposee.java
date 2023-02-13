package fr.eseo.cpoo.exo1_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FigureComposee extends Forme{

    private ArrayList<Forme> formes;
    public FigureComposee(Forme[] formes) {
        super();
        this.formes = new ArrayList<Forme>();
        this.formes.addAll(Arrays.asList(formes));
    }

    public List<Forme> getFormes() {
        return formes;
    }

    public void ajouterForme(Forme forme) {
        this.formes.add(forme);
    }


    @Override
    public double aire() {
        double aire = 0;
        for (Forme forme : formes) {
            aire += forme.aire();
        }
        return aire;
    }

    @Override
    public double perimetre() {
        double perimetre = 0;
        for (Forme forme : formes) {
            perimetre += forme.perimetre();
        }
        return perimetre;
    }
}
