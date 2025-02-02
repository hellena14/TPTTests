package tasks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4_FavSportPage extends BasePage{

    private By inputFieldLocator = By.xpath("//input[@placeholder='Your favorite sport']");
    private By closeButton = By.xpath("//kendo-autocomplete//span[@class='k-clear-value']");

    public Task4_FavSportPage(WebDriver driver) {
        super(driver);
    }

    public void clickInputField () {
        WebElement inputField = find(inputFieldLocator);
        inputField.click();
    }

    public void insertText(String text) {
        WebElement inputField = find(inputFieldLocator);
        inputField.sendKeys(text);
    }

    public void clickEnter() {
        WebElement inputField = find(inputFieldLocator);
        inputField.sendKeys("\ue007");
    }

    public boolean isTextInserted (String expectedText) {
        WebElement inputField = find(inputFieldLocator);
        String actualText = inputField.getAttribute("value");
        return actualText.equals(expectedText);
    }

    public void clearField() {
        WebElement closeX = find(closeButton);
        closeX.click();
    }
}
