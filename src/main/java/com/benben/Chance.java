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
        return new Chance(chance.fraction * this.fraction);
    }

    public Chance or(Chance chance) {
        double fraction = this.and(chance.not()).fraction + chance.and(this.not()).fraction;
        return new Chance(fraction);
    }
}
