import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmo {
    public static void main(String[] args){

        System.out.println("Hi there");
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestingplayground.com/sampleapp");
        driver.findElement(By.name("UserName")).click();

        driver.findElement(By.name("UserName")).sendKeys("u.akhi");
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("UPassword")).sendKeys("pwd");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.linkText("Log Out")).click();

    }



}
