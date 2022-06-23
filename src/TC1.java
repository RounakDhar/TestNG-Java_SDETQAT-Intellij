import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before every class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after every class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @Test
    void test1(){
        System.out.println("This is Test 1...");
    }

    @Test
    void test2(){
        System.out.println("This is Test 2...");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after the Test");
    }
}
