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
    public void testListWebElement() {
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
         driver.get("https://askomdch.com/");
         WebElement featuredProducts = driver.
                 findElement(By.xpath("//div[@class='wp-block-group alignfull']//ul"));
         featuredProducts.findElements(By.tagName("li"));

         List<WebElement> products = featuredProducts.findElements(By.tagName("li"));

         for (WebElement element : products) {
             System.out.println(element.findElement(By.tagName("h2")).getText());
             System.out.println("----------");
         }

         for (WebElement element : products) {
             List<WebElement> x = element.findElements(By.tagName("h2"));
             System.out.println(x.size());
         }

         driver.quit();
     }

    @Test
    public void testBestSeller() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.get("https://askomdch.com/");
            driver.findElement(By.xpath("//a[@href='https://askomdch.com/store/']")).click();
            WebElement bestSeller = driver.findElement(By.className("product_list_widget"));
            List<WebElement> bestSellers = bestSeller.findElements(By.tagName("li"));

        for (WebElement elem : bestSellers) {
            List<WebElement> dollarSymbol = elem.findElements(By.tagName("bdi"));
            if(dollarSymbol.size() > 1)
                System.out.println(dollarSymbol.get(1).getText());
            else System.out.println(dollarSymbol.get(0).getText());
        }

        driver.quit();
        }
    @Test
    public void testSelenium() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://askomdch.com/");
        driver.findElement(By.xpath("//a[@href='https://askomdch.com/store/']")).click();

        WebElement area = driver.findElement(By.id("woocommerce_top_rated_products-3"));
        List<WebElement> dollarSymbol = area.
                //findElements(By.xpath(".//span[@class='woocommerce-Price-currencySymbol']"));
                  findElements(By.className("woocommerce-Price-currencySymbol"));
        System.out.println(dollarSymbol.size());

        driver.quit();
    }











//        System.out.println(products.get(0).getAttribute("baseURI"));
//        System.out.println(products.get(0).getAttribute("textContent"));
//        System.out.println(products.get(0).findElement(By.tagName("h2")).getAttribute("textContent"));
//        System.out.println(products.get(0).findElement(By.tagName("h2")).getText());
//        System.out.println(products.get(0).findElement(By.tagName("h2")).getAttribute("innerHTML"));
//        System.out.println(products.get(0).findElement(By.tagName("h2")).getAttribute("outerHTML"));





    }




