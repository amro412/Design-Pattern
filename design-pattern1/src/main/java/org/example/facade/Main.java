package org.example.facade;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SurroundSoundSystem soundSystem = new SurroundSoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector, soundSystem);


        homeTheater.watchMovie("Avengers");
        System.out.println();

        homeTheater.endMovie();
    }
}
