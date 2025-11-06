package epam.tasks.DesignPatterns_task2_Factory;

public class MyChromeCapabilities implements BrowserDriverCap {

	@Override
    public void openBrowser() {
        System.out.println("Opening Chrome Browser with Custom Capabilities: Headless, Incognito");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser with Custom Capabilities");
    }
}
