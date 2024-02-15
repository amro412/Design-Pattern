package org.example.Factory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starts.......");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome! Which city do you want to visit? Enter the City Code: ");
        int cityCode = scanner.nextInt();

        TourFactory tourFactory = new TourFactory();
        Egypt touringCity = tourFactory.getCityByCode(cityCode);

        if (touringCity != null) {
            System.out.println("Best Places to visit:");
            System.out.println(touringCity.displayTheBestPlaces());
        } else {
            System.out.println("Unknown City Code");
        }
    }
}
