package tasks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class Task3_TablePage extends BasePage{


    private By filterCountryButton = By.xpath("//th[.//span[contains(text(),'Country')]]//a[@title='Country Column Menu']");
    private By filterButton = By.xpath("//div[contains(text(),'Filter')]");
    private By filterSubmit = By.xpath("//button[text()='Filter']");
    private By filterStatusButton = By.xpath("//th[.//span[contains(text(),'Status')]]//a[@title='Status Column Menu']");
    private By exportButton = By.xpath("//span[text()='Export to Excel']");

    public Task3_TablePage(WebDriver driver) {
        super(driver);
    }

    public void findCountryAndFilter(String filterValue) throws InterruptedException {
        click(filterCountryButton);
        Thread.sleep(1000);
        click(filterButton);

        List<WebElement> inputFields = driver.findElements(By.xpath("//input[@aria-label='Country Filter']"));

        Thread.sleep(1000);
        inputFields.get(0).click();
        inputFields.get(0).sendKeys(filterValue);

        Thread.sleep(1000);
        click(filterSubmit);

        Thread.sleep(1000);
        List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));

        for (WebElement row : rows) {

            String name = row.findElement(By.cssSelector("td:nth-child(2)")).getText();
            String job = row.findElement(By.cssSelector("td:nth-child(3)")).getText();
            String phone = row.findElement(By.cssSelector("td:nth-child(9)")).getText();
            String address = row.findElement(By.cssSelector("td:nth-child(10)")).getText();

            System.out.println("Name: " + name + ", Job " + job + ", Phone: " + phone + ", Address: " + address);
        }
    }

    public void exportTable() throws InterruptedException {
        click(filterStatusButton);
        Thread.sleep(1000);
        click(filterButton);

        List<WebElement> radioButtons = driver.findElements(By.xpath("//kendo-radiobutton[@aria-label='Status Filter']"));
        radioButtons.get(0).click();

        Thread.sleep(1000);
        click(filterSubmit);

        Thread.sleep(1000);
        click(exportButton);
    }
}
