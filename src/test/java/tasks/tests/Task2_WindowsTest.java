package tasks.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.base.BaseTest;
import tasks.pages.Task2_WindowsPage;

public class Task2_WindowsTest extends BaseTest {

    @Test
    public void testWindow() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-angular-ui/demos/dialogs/preview?theme=default-main");

        Task2_WindowsPage windowsPage = new Task2_WindowsPage(driver);

        windowsPage.openWindow();

        Assert.assertEquals(windowsPage.getDialogName(), "About");
        Assert.assertEquals(windowsPage.getDialogText(), "Additional info");
        Assert.assertTrue(windowsPage.isMinimuzeButtonVisible());
        Assert.assertTrue(windowsPage.isMaximizeButtonVisible());
        Assert.assertTrue(windowsPage.isCloseButtonVisible());

        Thread.sleep(2000);
        windowsPage.maximizeWindow();
        Assert.assertFalse(windowsPage.isMaximizeButtonVisible());

        Thread.sleep(2000);
        windowsPage.closeWindow();
        Assert.assertFalse(windowsPage.isWindowClosed());
    }
}
