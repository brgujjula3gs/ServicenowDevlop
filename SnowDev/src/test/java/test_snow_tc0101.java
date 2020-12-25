import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test_snow_tc0101 {

    //Click on Sign in  button
    //Validate the page title is changed
    //Validate the Heading "ALREADY REGISTERED?" is available on the page



    public static void main(String args[]) throws InterruptedException {

        snow_loginpage snow_loginpage_obj = new snow_loginpage();
        snow_logoutpage snow_logoutpage_obj = new snow_logoutpage();

        System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);

        WebElement signinElement = snow_loginpage_obj.getSigninElement(driver);
        signinElement.click();

        WebElement signoutElement = snow_logoutpage_obj.getSignoutElement(driver);
        signoutElement.click();

    }
}
