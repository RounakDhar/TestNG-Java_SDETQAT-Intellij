package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browserdrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }

    @Test
    void homePageTitle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browserdrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        Thread.sleep(5000);
    }

    //@AfterTest
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
