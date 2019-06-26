package com.benben;

public class Chance {
    private static double FULL_PROBABILITY = 1;
    private double fraction;

    public Chance(double fraction) {
        this.fraction = fraction;
    }

    public double getFraction() {
        return fraction;
    }

    public Chance not() {
        return new Chance(FULL_PROBABILITY - this.fraction);
    }

    public Chance and(Chance chance) {
        double resultFraction = chance.getFraction() * this.fraction;
        return new Chance(resultFraction);
    }

    public Chance or(Chance chance) {
        double fraction = this.and(chance.not()).getFraction() + chance.and(this.not()).getFraction();
        return new Chance(fraction);
    }
}
