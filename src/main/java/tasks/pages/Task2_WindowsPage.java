package tasks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_WindowsPage extends BasePage{

    private By openWindowButton = By.xpath("//button[span[text()='Open window']]");
    private By dialogWindow = By.cssSelector("kendo-window[aria-labelledby='kendo-window-title-21953']");
    private By dialogName = By.xpath("//span[text()='About']");
    private By dialogText = By.xpath("//p[text()='Additional info']");
    private By minimizeButton = By.cssSelector("button[title='Minimize']");
    private By maximizeButton = By.cssSelector("button[title='Maximize']");
    private By closeButton = By.cssSelector("button[title='Close']");

    public Task2_WindowsPage(WebDriver driver) {
        super(driver);
    }

    public void openWindow() {
       click(openWindowButton);
    }

    public String getDialogName() {
        return find(dialogName).getText();
    }

    public String getDialogText() {
        return find(dialogText).getText();
    }

    public boolean isMinimuzeButtonVisible() {
        WebElement button = find(minimizeButton);
        return button.isDisplayed();
    }

    public boolean isMaximizeButtonVisible() {
        WebElement button = find(maximizeButton);
        return button.isDisplayed();
    }

    public boolean isCloseButtonVisible() {
        WebElement button = find(closeButton);
        return button.isDisplayed();
    }

    public void maximizeWindow() {
        click(maximizeButton);
    }

    public void closeWindow() {
       click(closeButton);
    }

    public boolean isWindowClosed() {
        return !driver.findElements(dialogWindow).isEmpty();
    }
}
