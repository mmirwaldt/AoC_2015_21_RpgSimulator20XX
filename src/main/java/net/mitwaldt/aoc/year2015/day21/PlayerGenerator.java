package net.mitwaldt.aoc.year2015.day21;

import java.util.*;

public class PlayerGenerator {
    public static List<Player> createPlayers(int hitPoints) {
        final List<Player> players = new ArrayList<>();
        for (Weapon weapon : Weapon.values()) {
            for (Armor armor : Armor.values()) {
                for (int numberOfRings = 0; numberOfRings <= 2; numberOfRings++) {
                    if(numberOfRings == 0) {
                        players.add(new Player("me", hitPoints, weapon, armor, Collections.emptyList()));
                    }
                    for (int oneRingIndex = 0; numberOfRings == 1 && oneRingIndex < Ring.values().length; oneRingIndex++) {
                        final Ring ring = Ring.values()[oneRingIndex];
                        players.add(new Player("me", hitPoints, weapon, armor, Collections.singletonList(ring)));
                    }
                    for (int firstRingIndex = 0; numberOfRings == 2 && firstRingIndex < Ring.values().length - 1; firstRingIndex++) {
                        for (int secondRingIndex = firstRingIndex + 1; secondRingIndex < Ring.values().length; secondRingIndex++) {
                            final Ring firstRing = Ring.values()[firstRingIndex];
                            final Ring secondRing = Ring.values()[secondRingIndex];
                            players.add(new Player("me", hitPoints, weapon, armor, Arrays.asList(firstRing, secondRing)));
                        }
                    }
                }
            }
        }
        return players;
    }
}
