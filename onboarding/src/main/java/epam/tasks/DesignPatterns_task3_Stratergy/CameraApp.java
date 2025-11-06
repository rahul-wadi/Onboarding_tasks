package epam.tasks.DesignPatterns_task3_Stratergy;

public class CameraApp {

	public static void main(String[] args) {
        PhoneCameraApp basicApp = new BasicCameraApp();
        basicApp.setShareBehavior(new ShareByText());
        basicApp.takePhoto();
        basicApp.editPhoto();
        basicApp.savePhoto();
        basicApp.performShare();

        System.out.println();

        PhoneCameraApp plusApp = new CameraPlusApp();
        plusApp.setShareBehavior(new ShareByEmail());
        plusApp.takePhoto();
        plusApp.editPhoto();
        plusApp.savePhoto();
        plusApp.performShare();

        System.out.println("\nUser decides to share on social media instead:");
        plusApp.setShareBehavior(new ShareBySocialMedia());
        plusApp.performShare();
    }
}
