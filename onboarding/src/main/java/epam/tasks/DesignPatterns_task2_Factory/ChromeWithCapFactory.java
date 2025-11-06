package epam.tasks.DesignPatterns_task2_Factory;

public class ChromeWithCapFactory extends BrowserFactoryCap {

	@Override
    public BrowserDriverCap createBrowserDriver() {
        return new MyChromeCapabilities();
    }
}
