package epam.tasks.DesignPatterns_task2_Factory;

public class BrowserFactory {

	public static BrowserDriver getBrowser(String browserType) {
        if (browserType == null) {
            throw new IllegalArgumentException("Browser type cannot be null");
        }

        switch (browserType.toLowerCase()) {
            case "chrome":
                return new MyChromeDriver();
            case "firefox":
                return new MyFirefoxDriver();
            case "ie":
            case "internet explorer":
                return new MyInternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Unknown browser type: " + browserType);
        }
    }
}
