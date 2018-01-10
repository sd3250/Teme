import ro.sci.domain.DealerCar;
import ro.sci.domain.DealerShip;
import ro.sci.domain.Price;
import ro.sci.service.DelearShipUtils;

public class Main {

    public static void main(String[] args) {

        DealerCar c1 = new DealerCar(100,3,2,"mazda", "nashpa",2001,true,2, new Price(100000,"Euro"));
        DealerCar c2 = new DealerCar(200,3,2,"mazda", "nashpa",2001,true,2, new Price(200000,"Euro"));
        DealerCar c3 = new DealerCar(300,3,2,"bmw", "nashpa",2001,true,2, new Price(300000,"Euro"));

        DealerShip dealerShip = new DealerShip();
        dealerShip.addCar(c1);
        dealerShip.addCar(c2);
        dealerShip.addCar(c3);
        dealerShip.setName("mazda");

        DelearShipUtils d = new DelearShipUtils();
        d.listCars(dealerShip);

    }
}
