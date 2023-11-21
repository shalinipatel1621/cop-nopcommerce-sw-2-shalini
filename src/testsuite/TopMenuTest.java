package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //find the element and click on Computers Tab
        WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        computer.click();
        //verify the text 'computers'
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Find the element and click on Electronics tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")).click();
        //Verify the text electronics
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Find the element and click on Apparel Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")).click();
        //Verify the text Apparel
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Find the element and click on Apparel Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")).click();
        //Verify the text Digital downloads
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //Find the element and click on Apparel Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")).click();
        //Verify the text Books
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Find the element and click on Jewelry Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")).click();
        //Verify the text Gift Jewelry
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //Find the element and click on GiftCards Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")).click();
        //Verify the text Gift Cards
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @After
    public void teardown() {
         closeBrowser();
    }


}
