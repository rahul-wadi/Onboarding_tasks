package epam.tasks.DesignPatterns_task2_Factory;

public class FirefoxWithCapFactory extends BrowserFactoryCap {

	@Override
    public BrowserDriverCap createBrowserDriver() {
        return new MyFirefoxCapabilities();
    }
}
