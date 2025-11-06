package epam.tasks.DesignPatterns_task2_Factory;

public class MainDriver {

	public static void main(String[] args) {
        BrowserDriver browser = BrowserFactory.getBrowser("chrome");

        browser.initializeDriver();
        browser.openURL("https://www.google.com");
        browser.quitDriver();
    }
}
