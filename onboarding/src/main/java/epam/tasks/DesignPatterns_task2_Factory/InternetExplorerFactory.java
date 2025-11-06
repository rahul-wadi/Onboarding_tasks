package epam.tasks.DesignPatterns_task2_Factory;

public class InternetExplorerFactory extends BrowserFactoryCap {

	@Override
    public BrowserDriverCap createBrowserDriver() {
        return new MyInternetExplorerDriverCap();
    }
}
