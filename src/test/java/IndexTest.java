import costants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void checkElementСTest() {
        driver.get(Urls.myPage);
        driver.findElement(By.id("h1"));
        WebElement greeting = driver.findElement(By.name("greeting"));
        boolean isgreetingDisplayed = greeting.isDisplayed();
        Assert.assertTrue(isgreetingDisplayed);
    }

    @Test
    public void checkElementHTest() {
        driver.get(Urls.myPage);
        driver.findElement(By.id("select_1"));
        WebElement list = driver.findElement(By.name("my_fellow_travellers"));
        boolean islistDisplayed = list.isDisplayed();
        Assert.assertTrue(islistDisplayed);
    }

    @Test
    public void checkElementKTest() {
        driver.get(Urls.myPage);
        driver.findElement(By.id("input_2"));
        WebElement button = driver.findElement(By.cssSelector("[value=Click me]"));
        boolean isbuttonDisplayed = button.isDisplayed();
        Assert.assertTrue(isbuttonDisplayed);
    }

    @Test
    public void checkMyNameTest() {
        driver.get(Urls.myPage);
        String actualText = driver.findElement(By.name("acquaintance")).getAttribute("Karolina");
        WebElement myName = driver.findElement(By.id("div_1"));
        boolean isMyNameDisplayed = myName.isDisplayed();
        Assert.assertTrue(isMyNameDisplayed);
    }

    @Test
    public void checkLinkTest() {
        driver.get(Urls.myPage);
        driver.findElement(By.linkText("Click me!")).click();
        WebElement search = driver.findElement(By.id("ss"));
        boolean isSearchDisplayed = search.isDisplayed();
        Assert.assertTrue(isSearchDisplayed, "'search' is not displayed");
    }

    @Test
    public void checkTextBehindPictureTest() {
        driver.get(Urls.myPage);
        driver.findElement(By.id("img_1")).getAttribute("oops, you found it");
        WebElement picture = driver.findElement(By.id("img_1"));
        boolean isPictureDispalyed = picture.isDisplayed();
        Assert.assertTrue(isPictureDispalyed, "oops, you found it");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
