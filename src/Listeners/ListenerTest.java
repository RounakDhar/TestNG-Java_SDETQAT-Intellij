package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.CustomListeners.class)
@Listeners(CustomListeners.class)
public class ListenerTest {

    @Test
    void test1(){
        System.out.println("this is test1");
        Assert.assertEquals("A","A");
    }

    @Test
    void test2(){
        System.out.println("this is test2");
        Assert.assertEquals("A","B");
    }


    @Test
    void test3(){
        System.out.println("this is test3");
        //Assert.assertEquals("A","B");
        throw new SkipException("This is Skip Exception");
    }
}
