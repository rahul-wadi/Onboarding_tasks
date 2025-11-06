package epam.tasks.DesignPatterns_task2_Factory;

public class ChromeFactory extends BrowserFactoryCap {

	@Override
    public BrowserDriverCap createBrowserDriver() {
        return new MyChromeDriverCap();
    }
}
