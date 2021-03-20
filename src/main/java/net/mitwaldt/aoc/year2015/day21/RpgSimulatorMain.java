package net.mitwaldt.aoc.year2015.day21;

import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class RpgSimulatorMain {
    public static void main(String[] args) {
        final List<Player> mePlayers = PlayerGenerator.createMePlayers();
        int minCost = Integer.MAX_VALUE;
        int maxCost = 0;
        for (Player me : mePlayers) {
            final Player winner = RpgSimulator.fight(me, createEnemy());
            if(winner == me) {
                minCost = min(minCost, me.getCost()); // for part one
            } else {
                maxCost = max(maxCost, me.getCost()); // for part two
            }
        }
        System.out.println(minCost); // result : 78
        System.out.println(maxCost); // result : 148
    }

    private static Player createEnemy() {
        // I am too lazy to read out the values from input.txt
        return new Player("enemy", 104, 8, 1);
    }
}
