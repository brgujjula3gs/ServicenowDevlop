import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snow_loginpage {

    public static void main (String args[]) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver","D:\\Java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);

        driver.findElement(By.linkText("Sign in")).click();
        System.out.println("clicked on sign in");

    }
}
