package net.mitwaldt.aoc.year2015.day21;

import java.util.*;

public class PlayerGenerator {
    public static List<Player> createMePlayers() {
        final List<Player> players = new ArrayList<>();
        for (Weapon weapon : Weapon.values()) {
            for (Armor armor : Armor.values()) {
                for (int numberOfRings = 0; numberOfRings <= 2; numberOfRings++) {
                    if(numberOfRings == 0) {
                        players.add(createNewPlayer(weapon, armor, Collections.emptyList()));
                    }
                    final Ring[] rings = Ring.values();
                    for (int index = 0; numberOfRings == 1 && index < rings.length; index++) {
                        final Ring ring = rings[index];
                        players.add(createNewPlayer(weapon, armor, Collections.singletonList(ring)));
                    }
                    for (int firstIndex = 0; numberOfRings == 2 && firstIndex < rings.length - 1; firstIndex++) {
                        for (int secondIndex = firstIndex + 1; secondIndex < rings.length; secondIndex++) {
                            final Ring firstRing = rings[firstIndex];
                            final Ring secondRing = rings[secondIndex];
                            players.add(createNewPlayer(weapon, armor, Arrays.asList(firstRing, secondRing)));
                        }
                    }
                }
            }
        }
        return players;
    }

    private static Player createNewPlayer(Weapon weapon, Armor armor, List<Ring> rings) {
        return new Player("me", 100, weapon, armor, rings);
    }
}
