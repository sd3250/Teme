package ro.sci.service;

import ro.sci.domain.Car;
import ro.sci.domain.DealerShip;

import java.lang.reflect.Array;

import static java.util.Arrays.copyOf;

/**
 * Created by dan.sabau on 1/10/2018
 */
public class DelearShipUtils {

    public static void listCars(DealerShip d){
        for (int i = 0; i < d.getIndex(); i++){
            System.out.println(d.getCarById(i).toString());
        }
    }

    public static Car[] getFast(DealerShip d){
        Car[] cars = new Car[1];
        int index = 0;
        for (int i =0 ; i < d.getIndex(); i++){
            if (d.getCarById(i).isFastCharge() == true){
                cars[index] = d.getCarById(i);
                index++;
                cars = copyOf(cars, index);
            }
        }

        return cars;
    }

}
