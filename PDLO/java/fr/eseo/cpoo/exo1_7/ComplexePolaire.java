package fr.eseo.cpoo.exo1_7;

public class ComplexePolaire {
    private double module;
    private double argument;

    public ComplexePolaire(boolean estPolaire) {
        this(0, 0);
    }

    public ComplexePolaire(double module, double argument) {
        this.module = module;
        this.argument = argument;
    }

    public double getImaginaire() {
        return module * Math.sin(argument);
    }

    public double getReelle() {
        return module * Math.cos(argument);
    }

    public void setReelle(double reelle) {
        this.module = Math.sqrt(Math.pow(reelle, 2) + Math.pow(getImaginaire(), 2));
        this.argument = Math.atan2(getImaginaire(), reelle);
    }

    public void setImmaginaire(double imaginaire) {
        this.module = Math.sqrt(Math.pow(getReelle(), 2) + Math.pow(imaginaire, 2));
        this.argument = Math.atan2(imaginaire, getReelle());
    }

    public double getModule() {
        return module;
    }

    public double getArgument() {
        return argument;
    }

    public void setArgument(double argument) {
        this.argument = argument;
    }

    public void setModule(double module) {
        this.module = module;
    }

    public ComplexePolaire plus(ComplexePolaire c) {
        return new ComplexePolaire(getModule() + c.getModule(), getArgument() + c.getArgument());
    }

    public ComplexePolaire fois(ComplexePolaire c) {
        return new ComplexePolaire(getModule() * c.getModule(), getArgument() + c.getArgument());
    }

    public void afficheInfo() {
        System.out.println("Module : " + getModule() + " Argument : " + getArgument());
    }

    public String formeCanonique() {
        return getReelle() + " + " + getImaginaire() + "i";
    }
}
