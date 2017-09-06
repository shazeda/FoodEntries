import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by shazeda on 9/5/17.
 */
public class CommonScript {

    WebDriver driver;
    FoodPage foodPage;

    @BeforeMethod
    public void setup() {

        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        String projectDir = System.getProperty("user.dir");
        driver.get("file://" + projectDir + "/webpage/foods.html");

        foodPage = PageFactory.initElements(driver, FoodPage.class);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
