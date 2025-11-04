package epam.tasks.coreJava_task5_Construscts;

public class SpeedTicket {
	 public static void main(String[] args) {
	        int speed = 86;
	        boolean isBirthday = true;
	        int result = 0;

	        if (isBirthday) {
	            speed = speed - 5;
	        }

	        if (speed <= 60) {
	            result = 0; // no ticket
	        } else if (speed <= 80) {
	            result = 1; // small ticket
	        } else {
	            result = 2; // big ticket
	        }

	        System.out.println(result);
	    }
}
