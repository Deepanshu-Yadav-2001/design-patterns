package Translator;

public class MicrosoftTranslator implements AdvancedTranslator {
    @Override
    public String translateWithMicrosoft(String text, String targetLanguage) {
        return "Translated text: " + text + " using Microsoft Translator to: " + targetLanguage;
    }

    @Override
    public String translateWithYandex(String text, String targetLanguage) {
        return null;
    }

    @Override
    public String getTranslator() {
        return "Microsoft";
    }
}
