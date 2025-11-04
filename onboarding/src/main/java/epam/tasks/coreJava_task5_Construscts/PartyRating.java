package epam.tasks.coreJava_task5_Construscts;

public class PartyRating {
	public static void main(String[] args) {
        int tea = 6;
        int candy = 14;
        int result;

        if (tea < 5 || candy < 5) {
            result = 0; // bad party
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            result = 2; // great party
        } else {
            result = 1; // good party
        }

        System.out.println(result);
    }
}
