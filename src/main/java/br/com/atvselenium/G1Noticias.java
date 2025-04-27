package br.com.atvselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class G1Noticias {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://g1.globo.com/");
            Thread.sleep(3000);

            List<WebElement> noticias = driver.findElements(By.xpath("//a[contains(@class, 'feed-post-link')]"));

            for (int i = 0; i < Math.min(10, noticias.size()); i++) {
                System.out.println((i + 1) + ". " + noticias.get(i).getText() + " - " + noticias.get(i).getAttribute("href"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
