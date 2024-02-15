package Adapter;

public class LanguageAdapter implements ArabicSpeaker {

    private EnglishSpeaker englishSpeaker;

    public LanguageAdapter(EnglishSpeaker englishSpeaker) {
        this.englishSpeaker = englishSpeaker;
    }

    public void arabicGreeting() {
        englishSpeaker.greeting();
    }
}