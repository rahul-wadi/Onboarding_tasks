package epam.tasks.DesignPatterns_task4_Decorator;

public class WebPageDemo {

	public static void main(String[] args) {
        Format mobileFormat = new Format("Mobile", 30);
        Format desktopFormat = new Format("Desktop", 50);

        Widget chatWidget = new Widget("Chat Support", 10);
        Widget feedbackWidget = new Widget("Feedback Form", 15);
        Widget analyticsWidget = new Widget("Analytics Tracker", 20);

        WebPage mobilePage = new WebPage("Home Page (Mobile)", mobileFormat);
        mobilePage.addWidget(chatWidget);
        mobilePage.addWidget(feedbackWidget);

        WebPage desktopPage = new WebPage("Home Page (Desktop)", desktopFormat);
        desktopPage.addWidget(chatWidget);
        desktopPage.addWidget(analyticsWidget);

        mobilePage.displayDetails();
        desktopPage.displayDetails();
    }
}
