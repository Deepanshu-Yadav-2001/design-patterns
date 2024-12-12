import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    private Logger() {
        try {
            FileWriter fw = new FileWriter("app.log", true);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    public void logInfo(String message) {
        writer.println("INFO: " + message);
    }

    public void logWarning(String message) {
        writer.println("WARNING: " + message);
    }

    public void logError(String message) {
        writer.println("ERROR: " + message);
    }
}
