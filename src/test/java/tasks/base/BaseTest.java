package tasks.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tasks.pages.BasePage;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
//    private String url = "https://demos.telerik.com/kendo-angular-ui/demos/dialogs/preview?theme=default-main";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get(url);
//        basePage = new BasePage();
//        basePage.setDriver(driver);
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }
}
