public class Numeral extends Expression {
    private double value;

    public Numeral() {

    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == (int) value) {
            return String.format("%.0f", value);
        }
        return String.format("%.4f", value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
