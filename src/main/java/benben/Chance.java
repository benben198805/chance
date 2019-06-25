package benben;

public class Chance {
    private double fraction;

    public Chance(double fraction) {
        this.fraction = fraction;
    }

    public double getFraction() {
        return fraction;
    }

    public Chance not() {
        return new Chance(1 - this.getFraction());
    }

    public Chance and(Chance chance) {
        double resultFraction = chance.getFraction() * this.getFraction();
        return new Chance(resultFraction);
    }

    public Chance or(Chance chance) {
        return this.and(chance).not();
    }
}
