package com.games;

import java.util.*;

public class AdventureGame {
    private final Map<Integer, Location> locations = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, String> directionsVocabulary = new HashMap<>();

    public AdventureGame() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java and exiting the game", null));

        Map<String, Integer> tempExits = new HashMap<>();
        tempExits.put("E", 3);
        tempExits.put("W", 2);
        tempExits.put("N", 5);
        tempExits.put("S", 4);
        locations.put(1, new Location(1,"You are standing at the end of a road before a small brick building", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2,"You are at the top of a hill", tempExits));


        tempExits = new HashMap<>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3,"You are inside a building, a well house for a small spring", tempExits));


        tempExits = new HashMap<>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        locations.put(4, new Location(4,"You are in a valley beside a stream", tempExits));


        tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("S", 1);
        locations.put(5, new Location(5,"You are in the forest", tempExits));


        directionsVocabulary.put("NORTH", "N");
        directionsVocabulary.put("EAST", "E");
        directionsVocabulary.put("SOUTH", "S");
        directionsVocabulary.put("WEST", "W");
        directionsVocabulary.put("QUIT", "Q");
    }

    public void run() {
        int locationNumber = 1;


        while(true) {
            System.out.println(locations.get(locationNumber).getDescription());

            if(locationNumber == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(locationNumber).getExits();

            Set<String> locationExitsSet = exits.keySet();
            String[] locationExitsArray = new String[locationExitsSet.size()];
            locationExitsSet.toArray(locationExitsArray);

            System.out.print("\tAvailable exits are: ");

            int i = 0;

            for(; i < locationExitsArray.length - 1; i++) {
                System.out.print(locationExitsArray[i] + ", ");
            }

            System.out.print(locationExitsArray[i]);   // last element of String array printed out without the following coma
            System.out.print("\t\tChoice: ");

            String choice = scanner.nextLine().toUpperCase();

            if(choice.length() > 1) {
                choice = extractDirectionLetter(choice);
            }

            if(exits.containsKey(choice)) {
                locationNumber = exits.get(choice);
            } else {
                System.out.println("You cannot go in that direction");
            }

        }
    }

    private String extractDirectionLetter(String input) {
        String[] inputArray = input.split(" ");

        for(String i : inputArray) {
            if(directionsVocabulary.containsKey(i)) {
                return directionsVocabulary.get(i);
            }
        }

        return null;
    }
}






















