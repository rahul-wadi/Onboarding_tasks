package epam.tasks.Collections_task12_SetMap;

public class TotalFriends {

	public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addFriend("Alice", "Bob");
        sn.addFriend("Bob", "Charlie");

        sn.displayFriends("Alice");
        sn.displayFriends("Bob");
        sn.displayFriends("Charlie");

        sn.displayAllUsersWithFriendCount();
        sn.removeFriend("Alice", "Bob");

        sn.displayFriends("Alice");
        sn.displayFriends("Bob");
        sn.displayAllUsersWithFriendCount();
    }
}
