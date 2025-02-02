package tasks.tests;

import org.testng.annotations.Test;
import tasks.base.BaseTest;
import tasks.pages.Task3_TablePage;

public class Task3_TableTest extends BaseTest {

    @Test
    public void tableTest () throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-angular-ui/demos/grid/filter-all-columns?theme=default-main");
        Task3_TablePage tablePage = new Task3_TablePage(driver);

        tablePage.findCountryAndFilter("US");
        Thread.sleep(3000);
        tablePage.exportTable();
    }
}
