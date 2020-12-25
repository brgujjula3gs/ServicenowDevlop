import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snow_loginpage {

    public WebElement getSigninElement(WebDriver driver){
       WebElement signin = driver.findElement(By.linkText("Sign in"));
       return signin;
    }

}
