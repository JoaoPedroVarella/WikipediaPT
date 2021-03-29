package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url;
    WebDriver driver;

    @Before
    public void iniciar(){
        url = "https://pt.wikipedia.org/";
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        driver = new ChromeDriver(); //instanciar o Selenium como Chrome driver

        driver.manage().window().maximize();
        //Define uma espera implicita de 1min, verificando o carregamento a cada milliseconds
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @After
    public void finalizar(){
        driver.quit();
    }

    @Test
    public void consultarArtigo(){
        driver.get(url);

        driver.findElement(By.id("searchInput")).sendKeys("Ovo de Páscoa" + Keys.ENTER);
        //driver.findElement(By.id("SearchButton")).click();

        //assertEquals("Ovo de Páscoa ? Wikipédia, a enciclopédia livre", driver.getTitle());


        assertTrue(driver.getTitle().contains("Ovo de Páscoa"));

    }

}
