package epam.tasks.DesignPatterns_task3_Stratergy;

public class ShareBySocialMedia implements ShareBehavior {

	@Override
    public void share() {
        System.out.println("Sharing the photo on social media...");
    }
}
