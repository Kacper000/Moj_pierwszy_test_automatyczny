package Testy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Time;

import static java.lang.Thread.sleep;

public class MyTest extends TestBase{


    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://limanowa.in/");
        sleep(1000);
        WebElement webElement;
        webElement = driver.findElement(By.cssSelector("body > section.quickNavigation > div > div > div.rightSection > div.icons > a:nth-child(1) > i"));
        sleep(1000);
        webElement.click();
        sleep(1000);
        webElement = driver.findElement(By.cssSelector("#ldk_cinema_tab1 > a:nth-child(1) > div > div.rst > div.tit"));
        sleep(1000);
        webElement.click();
        sleep(1000);

    }


}