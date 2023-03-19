package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginExample {
   public static WebDriver driver;

    //to log into Syntax HRMS application using with the following credentials
   //UserName:Admin
   //password:12345
    @Test(priority=2)
   public void ainvalidCredentials1(){
   driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
   driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("12345");
   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
   String text=driver.findElement(By.id("spanMessage")).getText();
   System.out.println("a test"+ text);

    }

    //to log into Syntax HRMS application using with the following credentials
    //UserName:NoAdmin
    //password:123456


   @Test(priority=1)
 public  void binvalidCredentials2(){
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("NoAdmin");
       driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
       driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
       String text=driver.findElement(By.id("spanMessage")).getText();
       System.out.println("b test" + text);

    }
    //precondition -->open the browser and navigate to the URL
    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();


    }



}