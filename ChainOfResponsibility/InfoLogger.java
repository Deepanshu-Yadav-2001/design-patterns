public class InfoLogger extends Logger {

    public InfoLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("INFO: " + message);
    }
}
