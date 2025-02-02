package tasks.tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import tasks.base.BaseTest;
import tasks.pages.Task1_DialogPage;

public class Task1_DialogTest extends BaseTest {

    @Test
    public void testDialogFunc() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-angular-ui/demos/dialogs/preview?theme=default-main");

        Task1_DialogPage dialogPage = new Task1_DialogPage(driver);

        dialogPage.clickOpenDialogButton();

        assertTrue(dialogPage.isDialogDisplayed(), "Dialog does not open.");

        String backgroundColor = dialogPage.getYesButtonBackgroundColor();
        assertEquals(backgroundColor, "rgba(255, 99, 88, 1)", "Background color is correct.");

        dialogPage.focusOnCloseButton();
        dialogPage.closeDialogOnEnter();

        assertTrue(dialogPage.isDialogClosed(), "Dialog is not close.");
    }
}
