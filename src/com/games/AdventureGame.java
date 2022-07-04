package com.games;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdventureGame {
    private final Map<Integer, Location> locations = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private Map<String, String> directionsVocabulary = new HashMap<>();

    public AdventureGame() {
        locations.put(0, new Location("You are sitting in front of a computer learning Java and exiting the game"));
        locations.put(1, new Location("You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location("You are at the top of a hill"));
        locations.put(3, new Location("You are inside a building, a well house for a small spring"));
        locations.put(4, new Location("You are in a valley beside a stream"));
        locations.put(5, new Location("You are in the forest"));

        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("S", 4);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        directionsVocabulary.put("NORTH", "N");
        directionsVocabulary.put("EAST", "E");
        directionsVocabulary.put("SOUTH", "S");
        directionsVocabulary.put("WEST", "W");
    }

    public void run() {
        int locationNumber = 1;

        while(true) {
            System.out.println(locations.get(locationNumber));
        }
    }
}






















