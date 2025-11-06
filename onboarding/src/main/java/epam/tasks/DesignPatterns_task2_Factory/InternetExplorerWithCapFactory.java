package epam.tasks.DesignPatterns_task2_Factory;

public class InternetExplorerWithCapFactory extends BrowserFactoryCap {

	@Override
    public BrowserDriverCap createBrowserDriver() {
        return new MyInternetExpCapabilities();
    }
}
