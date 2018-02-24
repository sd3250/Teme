package ro.sci.service;

import ro.sci.domain.Car;
import ro.sci.domain.DealerShip;

import static java.util.Arrays.copyOf;

/**
 * Created by dan.sabau on 1/10/2018
 */
public class DelearShipUtils {

    public static void listCars(DealerShip d){
        for (int i = 0; i < d.getNumberOfCars(); i++){
            System.out.println(d.getCarById(i).toString());
        }
    }

    public static Car[] getFast(DealerShip d){
        Car[] cars = new Car[1];
        int index = 0;
        for (int i = 0; i < d.getNumberOfCars(); i++){
            if (d.getCarById(i).isFastCharge()){
                cars[index] = d.getCarById(i);
                index++;
                cars = copyOf(cars, index);
            }
        }

        return cars;
    }

}
