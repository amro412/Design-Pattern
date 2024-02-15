package org.example.Adapter;

public class Main {


    public static void main(String[] args) {

        EnglishSpeaker englishSpeaker = new EnglishSpeakerImpl();

        englishSpeaker.greeting();

        ArabicSpeaker arabicSpeaker = new LanguageAdapter(englishSpeaker);

        arabicSpeaker.arabicGreeting();
    }
}
