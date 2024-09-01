import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
    


        System.setProperty("webdriver.chrome.driver","C:\\Users\\mnave\\Desktop\\linkedinlogin\\Selenium\\src\\driver\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/login");    
        driver.manage().window().maximize();
        
        //findElement is the function

        WebElement Emailusername=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        
        
        WebElement websubmit=driver.findElement(By.xpath("//button[@type=\"submit\"]"));


        Emailusername.sendKeys("Navearasu");
        password.sendKeys("123456");
        


        

        
        

        Thread.sleep(5000);
       
        driver.quit();
        }
}