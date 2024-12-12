package Translator;

public class YandexTranslator implements AdvancedTranslator {
    @Override
    public String translateWithMicrosoft(String text, String targetLanguage) {
        return null;
    }

    @Override
    public String translateWithYandex(String text, String targetLanguage) {
        return "Translated text: " + text + " using Yandex Translator to: " + targetLanguage;
    }

    @Override
    public String getTranslator() {
        return "Yandex";
    }
}
