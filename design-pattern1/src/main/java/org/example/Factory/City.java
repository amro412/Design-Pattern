package org.example.Factory;

public enum City {
    CAIRO(new Cairo()),
    ALEX(new Alex());

    private final Egypt cityInstance;

    City(Egypt cityInstance) {
        this.cityInstance = cityInstance;
    }

    public Egypt getCityInstance() {
        return cityInstance;
    }
}
