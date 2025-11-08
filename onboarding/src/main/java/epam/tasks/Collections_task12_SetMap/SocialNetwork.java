package epam.tasks.Collections_task12_SetMap;

import java.util.*;

public class SocialNetwork {

	public Map<String, HashSet<String>> network;

    public SocialNetwork() {
        network = new HashMap<>();
    }

    public void addUser(String user) {
        network.putIfAbsent(user, new HashSet<>());
    }

    public void addFriend(String user1, String user2) {
        if (user1.equals(user2)) {
            System.out.println("A user cannot befriend themselves!");
            return;
        }

        addUser(user1);
        addUser(user2);

        network.get(user1).add(user2);
        network.get(user2).add(user1);
        
        System.out.println(user1 + " and " + user2 + " are now friends.");
    }

    public void removeFriend(String user1, String user2) {
        if (network.containsKey(user1)) network.get(user1).remove(user2);
        if (network.containsKey(user2)) network.get(user2).remove(user1);
    }

    public void displayFriends(String user) {
        if (!network.containsKey(user)) {
            System.out.println(user + " not found in the network.");
            return;
        }

        Set<String> friends = network.get(user);
        if (friends.isEmpty()) {
            System.out.println(user + " has no friends.");
        } else {
            System.out.println(user + "'s friends: " + friends);
        }
    }

    public void suggestMutualFriends(String user1, String user2) {
        if (!network.containsKey(user1) || !network.containsKey(user2)) {
            System.out.println("One or both users do not exist.");
            return;
        }

        Set<String> friends1 = network.get(user1);
        Set<String> friends2 = network.get(user2);

        Set<String> mutual = new HashSet<>(friends1);
        mutual.retainAll(friends2);

        if (mutual.isEmpty()) {
            System.out.println("No mutual friends between " + user1 + " and " + user2 + ".");
        } else {
            System.out.println("Mutual friends between " + user1 + " and " + user2 + ": " + mutual);
        }
    }
    
    public void displayAllUsersWithFriendCount() {
        System.out.println("\n--- Total Friends of Each User ---");
        for (String user : network.keySet()) {
            System.out.println(user + " has " + network.get(user).size() + " friend(s).");
        }
    }

    public void displayNetwork() {
        System.out.println("\n--- Social Network ---");
        for (Map.Entry<String, HashSet<String>> entry : network.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
