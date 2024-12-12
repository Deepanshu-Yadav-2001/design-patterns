public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger1 = Logger.getInstance();
        logger1.logInfo("Application started");

        // Attempt to get another instance of Logger
        Logger logger2 = Logger.getInstance();
        logger2.logWarning("Low disk space");

        // Verify that both logger1 and logger2 are the same instance
        System.out.println(logger1 == logger2); // Should print true
    }
}