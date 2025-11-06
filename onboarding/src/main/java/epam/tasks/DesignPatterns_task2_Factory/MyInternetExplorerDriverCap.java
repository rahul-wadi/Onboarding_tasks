package epam.tasks.DesignPatterns_task2_Factory;

public class MyInternetExplorerDriverCap implements BrowserDriverCap {

	@Override
    public void openBrowser() {
        System.out.println("Opening Internet Explorer Browser (Normal)");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Internet Explorer Browser (Normal)");
    }
}
