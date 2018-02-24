package ro.sci.domain;

public class Price {
    private double value;
    private String currencey;

    public Price() {
    }

    public Price(double value, String currencey) {

        this.value = value;
        this.currencey = currencey;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrencey() {
        return currencey;
    }

    public void setCurrencey(String currencey) {
        this.currencey = currencey;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + value +
                ", currencey='" + currencey + '\'' +
                '}';
    }
}
