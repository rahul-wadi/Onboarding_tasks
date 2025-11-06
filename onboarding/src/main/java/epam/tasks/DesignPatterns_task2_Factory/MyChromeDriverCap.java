package epam.tasks.DesignPatterns_task2_Factory;

public class MyChromeDriverCap implements BrowserDriverCap {

	@Override
	public void openBrowser() {
		System.out.println("Opening Chrome Browser (Normal)");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing Chrome Browser (Normal)");
	}
}
