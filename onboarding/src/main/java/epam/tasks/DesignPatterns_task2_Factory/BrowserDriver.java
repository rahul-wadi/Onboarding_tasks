package epam.tasks.DesignPatterns_task2_Factory;

public interface BrowserDriver {

	public void initializeDriver();
    public void openURL(String url);
    public void quitDriver();
}
