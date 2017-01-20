package driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;

public class Driver {

    // Holds the WebDriver instance
    public static WebDriver webDriver;

    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver
    @BeforeScenario
    public void initializeDriver() {
        webDriver = DriverFactory.getDriver();
    }

    // Close the webDriver instance
    @AfterScenario
    public void closeDriver(){
        webDriver.quit();
    }

}
