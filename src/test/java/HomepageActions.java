import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class HomepageActions {

    @Step("Select <Testers> section")
    public void selectUsersCategory(String category) throws InterruptedException {
        String elementData = category.toLowerCase().equals("testers") ? "qas" : "developers";
        ((JavascriptExecutor) Driver.webDriver).executeScript(String.format("$('.features-filter-value[data-value=%s]').first().click();", elementData));
    }

    @Step("Verify following points displayed <table>")
    public void verifyHomepagePoints(Table table) {
        table.getRows().stream().forEach(row -> {
            if (!row.get(0).equals("title")) {
                Assert.assertTrue(Driver.webDriver.getPageSource().contains(row.get(0)));
            }
        });


    }
}
