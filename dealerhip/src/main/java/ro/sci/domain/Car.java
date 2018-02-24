package ro.sci.domain;

public class Car {
    private boolean fastCharge;
    private float motor;
    private float battery;
    private float consumtion;
    private String manufacturer;
    private String model;
    private double year;

    public Car() {
    }

    public Car(boolean fastCharge, float motor, float battery, float consumtion, String manufacturer, String model, double year) {
        this.fastCharge = fastCharge;
        this.motor = motor;
        this.battery = battery;
        this.consumtion = consumtion;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public float getBattery() {
        return battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public float getConsumtion() {
        return consumtion;
    }

    public void setConsumtion(float consumtion) {
        this.consumtion = consumtion;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public boolean isFastCharge() {
        return fastCharge;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fastCharge=" + fastCharge +
                ", motor=" + motor +
                ", battery=" + battery +
                ", consumtion=" + consumtion +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
