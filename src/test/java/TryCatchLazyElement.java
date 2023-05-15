import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker;
import org.testng.annotations.Test;

import java.time.Duration;

public class TryCatchLazyElement {

    @Test
    public void findImage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/loading-images.html");

        for (int i = 0; ; i++) {
            if (i >= 40)
                throw new TimeoutException();
            try {
                driver.findElement(By.id("award"));
                break;
            } catch (NoSuchElementException e) {
                Thread.sleep(500);
            } finally {
                System.out.println("finally");
            }
        }
    driver.quit();
    }
}