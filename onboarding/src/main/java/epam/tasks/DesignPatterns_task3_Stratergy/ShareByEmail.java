package epam.tasks.DesignPatterns_task3_Stratergy;

public class ShareByEmail implements ShareBehavior {

	@Override
    public void share() {
        System.out.println("Sharing the photo via email...");
    }
}
