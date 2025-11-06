package epam.tasks.DesignPatterns_task2_Factory;

public class MyInternetExpCapabilities implements BrowserDriverCap {

	@Override
    public void openBrowser() {
        System.out.println("Opening Internet Explorer Browser with Custom Capabilities: Compatibility Mode");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Internet Explorer Browser with Custom Capabilities");
    }
}
