package epam.tasks.oops_task3;

@SuppressWarnings("serial")
public class InvalidPaymentDetailsException extends Exception {
	public InvalidPaymentDetailsException(String message) {
        super(message);
    }
}
