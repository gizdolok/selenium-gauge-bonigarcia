import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class GettingStartedActions {
    @Step("Ensure download section exists")
    public void ensureDownloadExists() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(Driver.webDriver.findElement(By.className("download-area")).isDisplayed());
    }
}
