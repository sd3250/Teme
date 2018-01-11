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
     * cand se foloseste, in alta metoda, daca nu tratez null, s-ar putea sa arunca a nullPointerExeption! de vazut cursul de 
     * exceptii, am ales sa nu tratez exceptia pentru ca e o exceptie de runtime si e mai costisitor ca resurse decat de 
     * verificat cand o identific si sa fac un if/else pe null la folosire, poate ca se complica codul in viitor, 
     * dar voi tine cont de acel null cand am sa apelez acest goz de cod cu un if, 
     * daca se vrea se trec la un try/cath/final, modific, dar aia o sa imi dauneze la runtime :)
     * (de revazut zilele astea acest goz si poate punem o exceptie aici, brain dead, cum dracu fac un remindef din asta?!, luna 
     * zice ca sa las asta ...
     */
    public DealerCar getCarById(int i){
        if (i > cars.length){
            return null;
        } else {
            return cars[i];
        }
    }
}
