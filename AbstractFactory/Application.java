public class Application {
    private Button button;
    private Checkbox checkbox;
    private TextField textField;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        textField = factory.createTextField();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
        textField.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new LinuxFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
}