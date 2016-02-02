package TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Anna on 21.01.2016.
 */

    @RunWith(Suite.class)
    @Suite.SuiteClasses({RozetkaPagesTest.HomePage.Basket.addToBasket.class, RozetkaPagesTest.HomePage.Basket.DeleteFromBasket.class})
    public class Runner {
}

