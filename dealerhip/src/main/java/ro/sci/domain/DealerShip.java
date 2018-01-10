package ro.sci.domain;

public class DealerShip {
    private String name;
    private DealerCar[] cars = new DealerCar[100];
    private int index;

    public DealerShip() {
    }

    public void addCar(DealerCar car){
        cars[index] = car;
        index++;
    }

    public DealerShip(String name) {
        this.name = name;
        this.index = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public DealerCar getCarById(int i){
        if (i > index){
            return null;
        } else {
            return cars[i];
        }
    }
}
