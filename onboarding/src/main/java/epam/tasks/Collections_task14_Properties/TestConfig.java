package epam.tasks.Collections_task14_Properties;

public class TestConfig {

	public static void main(String[] args) throws Exception {
        Config config = new Config();

        System.out.println(config.get("key1")); // A
        System.out.println(config.get("key2")); // D

        config.remove("key1");
        System.out.println(config.get("key1")); // B

        config.save();
        System.out.println(config.get("key1")); // B

        config.set("default.filenames", "default2");
        config.save();
        config.reset();

        System.out.println(config.get("key1")); // C
    }
}
