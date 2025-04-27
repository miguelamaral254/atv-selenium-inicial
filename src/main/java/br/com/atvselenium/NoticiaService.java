package br.com.atvselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoticiaService {

    public List<String> getNoticias() {
        List<String> noticiasList = new ArrayList<>();

        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-arm64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://g1.globo.com/");
            Thread.sleep(3000);

            List<WebElement> noticias = driver.findElements(By.xpath("//a[contains(@class, 'feed-post-link')]"));

            for (int i = 0; i < Math.min(10, noticias.size()); i++) {
                noticiasList.add(noticias.get(i).getText() + " - " + noticias.get(i).getAttribute("href"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

        return noticiasList;
    }
}
