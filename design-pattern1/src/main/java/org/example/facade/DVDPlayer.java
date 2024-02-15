package org.example.facade;

class DVDPlayer {
    public void play(String movie) {
        System.out.println("Playing DVD: " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }
}
