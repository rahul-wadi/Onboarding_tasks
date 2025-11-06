package epam.tasks.DesignPatterns_task3_Stratergy;

public abstract class PhoneCameraApp {

	protected ShareBehavior shareBehavior;

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public abstract void editPhoto();

    public void savePhoto() {
        System.out.println("Saving the photo...");
    }

    public void performShare() {
        shareBehavior.share();
    }

    public void setShareBehavior(ShareBehavior sb) {
        this.shareBehavior = sb;
    }
}
