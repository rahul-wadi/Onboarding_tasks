package epam.tasks.DesignPatterns_task3_Stratergy;

public class ShareByText implements ShareBehavior {

	@Override
	public void share() {
		System.out.println("Sharing the photo via text message...");
	}
}
