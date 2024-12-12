package TextEditor;

public class EditingState implements State {
    private final TextEditor textEditor;
    private String currentText;

    public EditingState(TextEditor textEditor) {
        this.textEditor = textEditor;
        currentText = textEditor.getText();
    }

    @Override
    public void open() {
        throw new RuntimeException("Text Editor is already open");
    }

    @Override
    public void enterText(String text) {
        currentText = text;
    }

    @Override
    public void save() {
        textEditor.setText(currentText);
    }

    @Override
    public void close() {
        textEditor.setCurrentState(textEditor.getClosedState());
    }
}
