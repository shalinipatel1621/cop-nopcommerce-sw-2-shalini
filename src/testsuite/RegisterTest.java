package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //find the register link and click
        WebElement registerLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerLink.click();
        //verify
        String expectedResult = "Register";
        String actualResult = driver.findElement(By.xpath("//a[@class='ico-register']")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //find the register link and click
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //Input data into the registration form
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.name("FirstName")).sendKeys("Jack");
        driver.findElement(By.name("LastName")).sendKeys("Jill");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("16");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("January");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1999");
        driver.findElement(By.id("Email")).sendKeys("jackjill@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("johnjoe");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("johnjoe");
        //verify the text
        driver.findElement(By.id("register-button")).click();
        driver.findElement(By.className("result")).getText();

    }


    @Test
    public void teardown() {
        //closeBrowser();
    }
}
