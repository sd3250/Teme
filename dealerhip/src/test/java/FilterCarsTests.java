import org.junit.Assert;
import org.junit.Test;
import ro.sci.domain.Car;
import ro.sci.domain.DealerCar;
import ro.sci.domain.DealerShip;
import ro.sci.domain.Price;
import ro.sci.service.DelearShipUtils;

/**
 * Created by dan.sabau on 1/10/2018
 */
public class FilterCarsTests {
    @Test
    public void filterFastCharge(){
        //given
        DealerCar c1 = new DealerCar(true,100,3,2,"mazda", "nashpa",2001,true,2, new Price(100000,"Euro"));
        DealerCar c2 = new DealerCar(false,200,3,2,"mazda", "nashpa",2001,true,2, new Price(200000,"Euro"));
        DealerCar c3 = new DealerCar(false,300,3,2,"bmw", "nashpa",2001,true,2, new Price(300000,"Euro"));
        DealerShip dealerShip = new DealerShip();
        dealerShip.addCar(c1);
        dealerShip.addCar(c2);
        dealerShip.addCar(c3);
        dealerShip.setName("mazda");
        //when
        Car[] fast = DelearShipUtils.getFast(dealerShip);
        System.out.println(fast.length);
        //then
        for (int i = 0; i < fast.length; i++) {
            Assert.assertEquals(fast[i].isFastCharge(), true);
        }
    }


}
