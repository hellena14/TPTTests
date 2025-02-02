package tasks.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.base.BaseTest;
import tasks.pages.Task4_FavSportPage;

public class Task4_FavSportTest extends BaseTest {

    @Test
    public void testFavoriteSportSelection() throws InterruptedException {

        Task4_FavSportPage favSportPage = new Task4_FavSportPage(driver);

        driver.get("https://demos.telerik.com/kendo-angular-ui/demos/dropdowns/overview?theme=default-main");
        favSportPage.clickInputField();
        favSportPage.insertText("Tennis");
        favSportPage.clickEnter();

        Assert.assertTrue(favSportPage.isTextInserted("Tennis"), "The text is not entered correctly!");

        Thread.sleep(2000);
        favSportPage.clearField();
    }
}
