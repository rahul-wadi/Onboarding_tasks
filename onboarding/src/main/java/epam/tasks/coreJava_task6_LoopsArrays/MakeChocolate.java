package epam.tasks.coreJava_task6_LoopsArrays;

public class MakeChocolate {

	public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));  // → 4
        System.out.println(makeChocolate(4, 1, 10)); // → -1
        System.out.println(makeChocolate(4, 1, 7));  // → 2
    }

    public static int makeChocolate(int small, int big, int goal) {
        int result;

        int maxBigBars = goal / 5;

        if (maxBigBars <= big) {
            int remaining = goal - (maxBigBars * 5);
            if (remaining <= small) {
                result = remaining;
            } else {
                result = -1;
            }
        } else {
            int remaining = goal - (big * 5);
            if (remaining <= small) {
                result = remaining;
            } else {
                result = -1;
            }
        }

        return result;
    }
}
