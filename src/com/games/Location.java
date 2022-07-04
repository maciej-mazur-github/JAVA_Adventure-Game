package com.games;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String description;
    private final Map<String, Integer> exits = new HashMap<>();

    public Location(String description) {
        this.description = description;
        exits.put("Q", 0);
    }

    void addExit(String direction, int locationNumber) {
        if(!exits.containsKey(direction)) {
            exits.put(direction, locationNumber);
        } else {
            System.out.println("This location already contains this exit. Try again");
        }
    }

    String getDescription() {
        return description;
    }

    Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
