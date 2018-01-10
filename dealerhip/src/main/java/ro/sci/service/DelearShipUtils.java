package ro.sci.service;

import ro.sci.domain.DealerShip;

/**
 * Created by dan.sabau on 1/10/2018
 */
public class DelearShipUtils {

    public void listCars(DealerShip d){
        for (int i = 0; i < d.getIndex(); i++){
            System.out.println(d.getCarById(i).toString());
        }
    }

}
