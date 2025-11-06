package epam.tasks.DesignPatterns_task2_Factory;

public class MyFirefoxCapabilities implements BrowserDriverCap {

	@Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser with Custom Capabilities: Disable Cache, Private Mode");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser with Custom Capabilities");
    }
}
