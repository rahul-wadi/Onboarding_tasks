package epam.tasks.DesignPatterns_task2_Factory;

public class FirefoxFactory extends BrowserFactoryCap {

	@Override
	public BrowserDriverCap createBrowserDriver() {
		return new MyFirefoxDriverCap();
	}
}
