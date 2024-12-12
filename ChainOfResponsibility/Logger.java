public abstract class Logger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected Logger nextLogger;
    protected int level;

    public Logger(int level) {
        this.level = level;
    }

    public void logMessage(int level, String message) {
        if (this.level == level) {
            write(message);
        } else {
            if (nextLogger != null) {
                nextLogger.logMessage(level, message);
            }
        }
    }

    public abstract void write(String message);

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

}
