import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import driver.Driver;

import static org.junit.Assert.assertTrue;

public class TestAssertion {
    @Step("Verify following sections exist <table>")
    public void verifySections(Table table) throws InterruptedException {
        Thread.sleep(1500);
        table.getRows().stream().forEach(row -> {
            if (!row.get(0).toLowerCase().equals("title")) {
                assertTrue(Driver.webDriver.getPageSource().contains(row.get(0)));
            }
        });
    }

    @Step("Verify page contains introduction text <file:resources/introduction.txt>")
    public void verifyPageContains(String content) throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(Driver.webDriver.getPageSource().contains(content));
    }
}
