package epam.tasks.DesignPatterns_task2_Factory;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyInternetExplorerDriver implements BrowserDriver {

	private WebDriver driver;

    @Override
    public void initializeDriver() {
        System.out.println("Initializing Internet Explorer Driver...");
        driver = new InternetExplorerDriver();
    }

    @Override
    public void openURL(String url) {
        driver.get(url);
        System.out.println("Opened URL in Internet Explorer: " + url);
    }

    @Override
    public void quitDriver() {
        driver.quit();
        System.out.println("Closed Internet Explorer browser.");
    }
}
