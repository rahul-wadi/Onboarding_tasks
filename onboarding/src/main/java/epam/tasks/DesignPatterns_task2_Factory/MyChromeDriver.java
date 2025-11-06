package epam.tasks.DesignPatterns_task2_Factory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class MyChromeDriver implements BrowserDriver {

	private WebDriver driver;

    @Override
    public void initializeDriver() {
        System.out.println("Initializing Chrome Driver...");
        driver = new ChromeDriver();
    }

    @Override
    public void openURL(String url) {
        driver.get(url);
        System.out.println("Opened URL in Chrome: " + url);
    }

    @Override
    public void quitDriver() {
        driver.quit();
        System.out.println("Closed Chrome browser.");
    }
}
