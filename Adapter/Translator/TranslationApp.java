package Translator;

class TranslationApp implements Translator {
    TranslatorAdapter translatorAdapter;

    @Override
    public String translate(String text, String targetLanguage) {
        // Default to Google Translate
        return new GoogleTranslator().translate(text, targetLanguage);
    }

    public String translate(String translatorType, String text, String targetLanguage) {
        if (translatorType.equalsIgnoreCase("google")) {
            return translate(text, targetLanguage);
        } else if (translatorType.equalsIgnoreCase("microsoft") ) {
            translatorAdapter = new TranslatorAdapter(new MicrosoftTranslator());
            return translatorAdapter.translate(text, targetLanguage);
        } else if (translatorType.equalsIgnoreCase("yandex")) {
            translatorAdapter = new TranslatorAdapter(new YandexTranslator());
            return translatorAdapter.translate(text, targetLanguage);
        } else {
            return "Invalid translator type. " + translatorType + " not supported";
        }
    }
}
