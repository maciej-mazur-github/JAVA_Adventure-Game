package com.games;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String description;
    private final int locationID;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.description = description;
        this.locationID = locationID;

        if(exits != null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }

        this.exits.put("Q", 0);
    }

    // Removed from code to protect the exits map from being modified unintentionally. This makes the class Location immutable
    /*void addExit(String direction, int locationNumber) {
        if(!exits.containsKey(direction)) {
            exits.put(direction, locationNumber);
        } else {
            System.out.println("This location already contains this exit. Try again");
        }
    }*/

    String getDescription() {
        return description;
    }

    Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
