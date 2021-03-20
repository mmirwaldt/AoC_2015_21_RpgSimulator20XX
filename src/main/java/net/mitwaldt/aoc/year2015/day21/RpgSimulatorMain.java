package net.mitwaldt.aoc.year2015.day21;

import java.util.List;

import static java.lang.Math.min;

public class RpgSimulatorMain {
    public static void main(String[] args) {
        // I am too lazy to read out the values from input.txt
        final List<Player> mePlayers = PlayerGenerator.createPlayers(100);
        int minCost = Integer.MAX_VALUE;
        for (Player me : mePlayers) {
            final Player winner = RpgSimulator.fight(me, createEnemy());
            if(winner == me) {
                minCost = min(minCost, winner.getCost());
            }
        }
        System.out.println(minCost); // result : 78
    }

    private static Player createEnemy() {
        return new Player("enemy", 104, 8, 1);
    }
}
