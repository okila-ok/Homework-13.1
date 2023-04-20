import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static java.sql.DriverManager.getDriver;

public class ListWebElement {

    @Test
    public void testListWebElement(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://askomdch.com/");
        WebElement featuredProducts = driver.
                findElement(By.xpath("//div[@class='wp-block-group alignfull']//ul"));
        featuredProducts.findElements(By.tagName("li"));
        List<WebElement> products = featuredProducts.findElements(By.tagName("li"));
        System.out.println(products.size());

  // start video from 27:20


        driver.quit();
    }


    }

