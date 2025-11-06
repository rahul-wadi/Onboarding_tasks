package epam.tasks.DesignPatterns_task4_Decorator;

import java.util.*;

public class WebPage {

	public String title;
	public Format format;
    public List<Widget> widgets;

    public WebPage(String title, Format format) {
        this.title = title;
        this.format = format;
        this.widgets = new ArrayList<>();
    }

    public void addWidget(Widget widget) {
        widgets.add(widget);
    }

    public int calculateRank() {
        int totalRank = format.getRank();
        for (Widget widget : widgets) {
            totalRank += widget.getRank();
        }
        return totalRank;
    }
    
    public void displayDetails() {
        System.out.println("Page: " + title);
        System.out.println("Format: " + format.getName() + " (Rank: " + format.getRank() + ")");
        System.out.println("Widgets:");
        for (Widget widget : widgets) {
            System.out.println("  - " + widget.getName() + " (Rank: " + widget.getRank() + ")");
        }
        System.out.println("Total Page Rank: " + calculateRank());
        System.out.println("---------------------------");
    }
}
