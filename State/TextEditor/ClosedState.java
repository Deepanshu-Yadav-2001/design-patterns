package TextEditor;

public class ClosedState implements State {
    private final TextEditor textEditor;

    public ClosedState(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void open() {
        textEditor.setCurrentState(textEditor.getEditingState());
    }

    @Override
    public void enterText(String text) {
        throw new RuntimeException("Text Editor not open");
    }

    @Override
    public void save() {
        throw new RuntimeException("Text Editor not open");
    }

    @Override
    public void close() {
        throw new RuntimeException("Text Editor already closed");
    }
}
