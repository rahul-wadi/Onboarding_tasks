package epam.tasks.coreJava_task5_Construscts;

public class BlueLotteryTicket {
	public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 7;

        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        int result;

        if (ab == 10 || bc == 10 || ac == 10) {
            result = 10;
        } else if (ab == bc + 10 || ab == ac + 10) {
            result = 5;
        } else {
            result = 0;
        }

        System.out.println("Result: " + result);
    }
}
