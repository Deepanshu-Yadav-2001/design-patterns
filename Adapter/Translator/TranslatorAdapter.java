package Translator;

public class TranslatorAdapter implements Translator {
    private final AdvancedTranslator advancedTranslator;

    public TranslatorAdapter(AdvancedTranslator advancedTranslator) {
        this.advancedTranslator = advancedTranslator;
    }
    @Override
    public String translate(String text, String targetLanguage) {
        if (advancedTranslator.getTranslator().equals("Microsoft")) {
            return advancedTranslator.translateWithMicrosoft(text, targetLanguage);
        }
        return advancedTranslator.translateWithYandex(text, targetLanguage);
    }
}
