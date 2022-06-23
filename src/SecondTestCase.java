import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority=1)
    void setup(){

        System.out.println("opening browser");
    }

    @Test(priority=3)
    void searchCustomer(){

        System.out.println("This is a Search Customer Test");
    }

    @Test(priority=2)
    void addCustomer(){

        System.out.println("This is a add Customer Test");
        Assert.assertEquals(1,2);
    }

    @Test(priority=4)
    void teardown(){

        System.out.println("closing browser");
    }
}
