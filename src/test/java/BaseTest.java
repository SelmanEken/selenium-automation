import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver;
    PraticeFormPage praticeFormPage;


    @BeforeAll
    public void setUp(){
        System.setProperty("WebDriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("Test initialated");
        praticeFormPage = new PraticeFormPage(driver);

    }
    @AfterAll
    public void tearDown(){
        driver.quit();
        System.out.println("Test finished");
    }
}
