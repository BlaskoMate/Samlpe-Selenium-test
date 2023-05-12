import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleTest {
    @Test
    public void openDemoPage(){
        System.setProperty("/webdriver.chrome.driver", System.getenv("CHROMEDRIVER_DIR"));
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/opt/google/chrome/google-chrome");  // TODO: use environmental variable
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//div[@id='site-name']"));
        System.out.println(element.getText());
        driver.close();
    }
}
