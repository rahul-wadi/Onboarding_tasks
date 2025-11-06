package epam.tasks.DesignPatterns_task2_Factory;

public class MyFirefoxDriverCap implements BrowserDriverCap {

	@Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser (Normal)");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser (Normal)");
    }
}
