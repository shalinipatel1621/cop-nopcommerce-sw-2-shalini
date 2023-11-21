package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/** Create the package ‘browserfactory’ and create the
* class with the name ‘BaseTest’ inside the ‘browserfactory’ package.
* and write the browser setup code inside the class ‘Base Test’.
 */


public class BaseTest {

    String browser = "Chrome";
    //Static baseURL = https://demo.nopcommerce.com/

    public static WebDriver driver;

    public void openBrowser(String baseURL){
        //Browser open code
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void closeBrowser(){
        //close browser
        driver.close();
    }
}
