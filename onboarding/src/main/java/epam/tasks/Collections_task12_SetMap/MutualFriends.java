package epam.tasks.Collections_task12_SetMap;

public class MutualFriends {

	public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addFriend("Alice", "Bob");
        sn.addFriend("Bob", "Charlie");

        sn.displayFriends("Alice");
        sn.displayFriends("Bob");
        sn.displayFriends("Charlie");

        sn.suggestMutualFriends("Alice", "Charlie");
        sn.addFriend("Alice", "David");
        sn.addFriend("Charlie", "David");

        sn.suggestMutualFriends("Alice", "Charlie");

        sn.removeFriend("Alice", "Bob");
        sn.displayFriends("Alice");
        sn.displayFriends("Bob");
        
        sn.displayNetwork();
    }
}
