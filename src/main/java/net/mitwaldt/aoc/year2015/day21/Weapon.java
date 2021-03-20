package net.mitwaldt.aoc.year2015.day21;

public enum Weapon {
    DAGGER(8, 4),
    SHORTSWORD(10, 5),
    WARHAMMER(25, 6),
    LONGSWORD(40, 7),
    GREATAXE(74, 8);

    private final int cost;
    private final int damage;

    Weapon(int cost, int damage) {
        this.cost = cost;
        this.damage = damage;
    }

    public int getCost() {
        return cost;
    }

    public int getDamage() {
        return damage;
    }
}
