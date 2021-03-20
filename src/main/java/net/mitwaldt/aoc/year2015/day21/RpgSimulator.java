package net.mitwaldt.aoc.year2015.day21;

public class RpgSimulator {
    /**
     * simulates a fight
     * @param me me
     * @param enemy the enemy
     * @return the winner
     */
    public static Player fight(Player me, Player enemy) {
        Player attacker = me;
        Player defender = enemy;
        while(0 < me.getHitPoints() && 0 < enemy.getHitPoints()) {
            attacker.attack(defender);
            final Player nextDefender = attacker;
            attacker = defender;
            defender = nextDefender;
        }

        if(0 < me.getHitPoints()) {
            return me;
        } else {
            return enemy;
        }
    }
}
