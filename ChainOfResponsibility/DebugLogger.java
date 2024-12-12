public class DebugLogger extends Logger {
    public DebugLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
