package ro.sci.domain;


import static java.util.Arrays.copyOf;

public class DealerShip {
    private String name;
    private DealerCar[] cars = new DealerCar[0];
 //   private int index;

    public DealerShip() {
    }

    public void addCar(DealerCar car){
        cars = copyOf(cars, cars.length+1);
        cars[cars.length-1] = car;
//        index++;
// mai trebui e adaugat daca masinile (cate sunt in stock) exista deja si adaugat stockul        
    }

    public DealerShip(String name) {
        this.name = name;
//        this.index = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number of uniq type of cars
     */
    public int getNumberOfCars() {
//        return index;
        return cars.length;
    }

     /**
     * cand se foloseste ar putea arunca a nullPointerExeption! de vazut cursul de exceptii 
     */
    public DealerCar getCarById(int i){
        if (i > cars.length){
            return null;
        } else {
            return cars[i];
        }
    }
}
