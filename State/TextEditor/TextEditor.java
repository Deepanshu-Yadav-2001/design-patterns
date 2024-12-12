package TextEditor;

public class TextEditor {
    private String text;
    private final State editingState;
    private final State closedState;

    private State currentState;

    public TextEditor() {
        text = "";
        editingState = new EditingState(this);
        closedState = new ClosedState(this);
        currentState = closedState;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public State getEditingState() {
        return editingState;
    }

    public State getClosedState() {
        return closedState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void open() {
        currentState.open();
    }

    public void enterText(String text) {
        currentState.enterText(text);
    }

    public void save() {
        currentState.save();
    }

    public void close() {
        currentState.close();
    }

    public void showText() {
        System.out.println(text);
    }
}
