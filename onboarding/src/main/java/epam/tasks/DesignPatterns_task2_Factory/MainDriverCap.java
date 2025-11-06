package epam.tasks.DesignPatterns_task2_Factory;

public class MainDriverCap {

	public static void main(String[] args) {
        // Normal Chrome Driver
        BrowserFactoryCap normalChromeFactory = new ChromeFactory();
        BrowserDriverCap normalChrome = normalChromeFactory.createBrowserDriver();
        normalChrome.openBrowser();
        normalChrome.closeBrowser();

        System.out.println();

        // Chrome Driver with Capabilities
        BrowserFactoryCap chromeCapFactory = new ChromeWithCapFactory();
        BrowserDriverCap chromeWithCaps = chromeCapFactory.createBrowserDriver();
        chromeWithCaps.openBrowser();
        chromeWithCaps.closeBrowser();

        System.out.println();

        // Firefox with Capabilities
        BrowserFactoryCap firefoxCapFactory = new FirefoxWithCapFactory();
        BrowserDriverCap firefoxWithCaps = firefoxCapFactory.createBrowserDriver();
        firefoxWithCaps.openBrowser();
        firefoxWithCaps.closeBrowser();
    }
}
