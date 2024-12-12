package TextEditor;

public interface State {
    void open();
    void enterText(String text);
    void save();
    void close();
}
