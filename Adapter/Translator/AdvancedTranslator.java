package Translator;

public interface AdvancedTranslator {
    String translateWithMicrosoft(String text, String targetLanguage);
    String translateWithYandex(String text, String targetLanguage);
    String getTranslator();
}
