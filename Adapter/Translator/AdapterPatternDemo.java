package Translator;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        TranslationApp translationApp = new TranslationApp();

        System.out.println(translationApp.translate("google", "Hello, world!", "es"));
        System.out.println(translationApp.translate("microsoft", "Hello, world!", "fr"));
        System.out.println(translationApp.translate("yandex", "Hello, world!", "de"));
        System.out.println(translationApp.translate("unknown", "Hello, world!", "it"));
    }
}