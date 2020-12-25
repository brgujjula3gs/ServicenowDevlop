import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class snow_logoutpage {

    public WebElement getSignoutElement(WebDriver driver){
        WebElement signout = driver.findElement(By.linkText("Sign out"));
        return signout;
    }

}
