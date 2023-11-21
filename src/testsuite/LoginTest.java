package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        //Actual text element and get the text from the element
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual
        Assert.assertEquals(expectedText, actualText);//last sentence
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //find and click on the login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find the email field and type the email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("johnjoe@gmail.com");

        //find password field and type
        driver.findElement(By.className("password")).sendKeys("johnjoe");
        //find the login button and click on it
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        //verify the 'log out' text is display
        String expectedText = "Log out";
        //find the actual text element and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals(expectedText, actualText);

    }
@Test
    public void verifyTheErrorMessage() {
        //find login link and click on it
        driver.findElement(By.linkText("Log in")).click();
        //enter invalid username
        WebElement invalidUsername = driver.findElement(By.name("Email"));
        invalidUsername.sendKeys("prime123kkk@gmail.com");
        //enter invalid password
        WebElement invalidPassword = driver.findElement(By.id("Password"));
        invalidPassword.sendKeys("prime123");
        //click on login button
        driver.findElement(By.xpath("//button[starts-with(@class,'button-1 login')]")).click();
        //Verify the error message
    String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";
//Find the error message element and get the text
    String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
    Assert.assertEquals("Not redirected to Login Page",expectedErrorMessage,actualErrorMessage);

    }
    @After
    public void teardown(){
        closeBrowser();

    }

}
