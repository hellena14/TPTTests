package tasks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_DialogPage extends BasePage{

    private By openDialogButton = By.xpath("//button[span[text()='Open dialog']]");
    private By dialog = By.cssSelector("div[role='dialog'].k-window.k-dialog");
    private By yesButton = By.xpath("//button[span[text()='Yes']]");

    public Task1_DialogPage(WebDriver driver) {
        super(driver);
    }

    public void clickOpenDialogButton() {
        find(openDialogButton).click();
    }

    public boolean isDialogDisplayed() {
        return find(dialog).isDisplayed();
    }

    public String getYesButtonBackgroundColor() {
        return find(yesButton).getCssValue("background-color");
    }

    public void focusOnCloseButton() {
        WebElement closeButton = find(By.xpath("//button[@title='Close' and contains(@class, 'k-icon-button')]"));
        closeButton.sendKeys("");
    }

    public void closeDialogOnEnter() {
        WebElement closeButton = find(By.xpath("//button[@title='Close' and contains(@class, 'k-icon-button')]"));
        closeButton.sendKeys("\ue007");
    }

    public boolean isDialogClosed() {
        try {
            return !find(dialog).isDisplayed();
        } catch (Exception e) {
            return true;
        }
    }
}

