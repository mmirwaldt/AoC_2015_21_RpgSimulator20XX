package net.mitwaldt.aoc.year2015.day21;

import org.junit.jupiter.api.Test;

import static net.mitwaldt.aoc.year2015.day21.RpgSimulator.fight;
import static org.junit.jupiter.api.Assertions.assertSame;

public class RpgSimulatorTest {
    @Test
    void test_fight() {
        final Player me = new Player("me",8, 5, 5);
        final Player enemy = new Player("enemy", 12, 7, 2);
        assertSame(me, fight(me, enemy));
    }
}
