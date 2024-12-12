package Translator;

public class GoogleTranslator implements Translator {
    @Override
    public String translate(String text, String targetLanguage) {
        return "Translated text: " + text + " using Google Translator to: " + targetLanguage;
    }
}
