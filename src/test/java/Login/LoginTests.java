package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //Import selenium driver
    private WebDriver driver;
    //Import chrome driver
    public void setUp()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        //Get the URL = deydam login URL
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //Wait for page to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize page
        driver.manage().window().maximize();
        //Get page title
        System.out.println(driver.getTitle());
        //Locate username field
        driver.findElement(By.id("username")).sendKeys("EbuwaO");
        //Locate password field
        driver.findElement(By.id("password")).sendKeys("akinbobola200");
        //Click on sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();

    }
        //Initiate test run
        public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
        }
    //Close browser after test

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        driver.quit();
    }

}
