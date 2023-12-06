package LoginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

   public static void main(String[] args) {
        System. setProperty("webdriver.gecko.driver","C:\\Software\\Driver\\Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("email")).sendKeys("ankitpatel1984@gmail.com");
        driver.findElement(By.className("password")).sendKeys("Aarna@2017");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        System.out.println("Current Url is:"+driver.getCurrentUrl());
        driver.close();

    }
}
