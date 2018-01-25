public class Income {

    private double value;

    public Income(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Income{" +
                "value=" + value +
                '}';
    }
}
