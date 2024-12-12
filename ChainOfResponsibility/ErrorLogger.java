public class ErrorLogger extends Logger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
