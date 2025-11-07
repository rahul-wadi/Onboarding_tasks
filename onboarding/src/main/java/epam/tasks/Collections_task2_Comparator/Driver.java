package epam.tasks.Collections_task2_Comparator;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            players[i] = new Player(sc.next(), sc.nextInt());
        }
        sc.close();

        // Sort using Checker comparator
        Arrays.sort(players, new Check());

        // Print sorted players
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }
    }
}
