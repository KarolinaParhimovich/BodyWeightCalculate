import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bodyWeightCalculateTest {
    @Test
    public void starvationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("35");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String actualText=driver.findElement(By.name("desc")).getAttribute("value");
    }
    @Test
    public void underweightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String actualText=driver.findElement(By.name("desc")).getAttribute("value");
    }
    @Test
    public void normalTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("65");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String actualText=driver.findElement(By.name("desc")).getAttribute("value");
    }
    @Test
    public void overweightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("75");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String actualText=driver.findElement(By.name("desc")).getAttribute("value");
    }
    @Test
    public void obeseTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("90");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String actualText=driver.findElement(By.name("desc")).getAttribute("value");
    }
}
