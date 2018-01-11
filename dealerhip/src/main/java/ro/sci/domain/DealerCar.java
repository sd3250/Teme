package ro.sci.domain;

public class DealerCar extends Car {
    private boolean isNew;
    private int stock;
    private Price price;

    public DealerCar(boolean isNew, int stock, Price price) {
        this.isNew = isNew;
        this.stock = stock;
        this.price = price;
    }

    public DealerCar(boolean fast, float motor, float battery, float consumtion, String manufacturer, String model, double year, boolean isNew, int stock, Price price) {
        super(fast,motor, battery, consumtion, manufacturer, model, year);
        this.isNew = isNew;
        this.stock = stock;
        this.price = price;
    }

    public DealerCar() {
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DealerCar{" +
                "isNew=" + isNew +
                ", stock=" + stock +
                ", price=" + price.toString() +
                super.toString() +
                '}';
    }
}
