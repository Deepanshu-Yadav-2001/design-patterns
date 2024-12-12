package TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.open();
        editor.enterText("Hello, World!");
        editor.save();
        System.out.println(editor.getText());

        editor.enterText("This should be allowed.");
        System.out.println(editor.getText());
        editor.save();
        editor.close();
        System.out.println(editor.getText());

        editor.enterText("This should not be allowed.");
    }
}