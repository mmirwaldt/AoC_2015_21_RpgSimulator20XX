package net.mitwaldt.aoc.year2015.day21;

public enum Ring {
    DAMAGE_PLUS_1(25, 1, 0),
    DAMAGE_PLUS_2(50, 2, 0),
    DAMAGE_PLUS_3(100, 3, 0),
    DEFENSE_PLUS_1(20, 0, 1),
    DEFENSE_PLUS_2(40, 0, 2),
    DEFENSE_PLUS_3(80, 0, 3);

    private final int cost;
    private final int damage;
    private final int armor;

    Ring(int cost, int damage, int armor) {
        this.cost = cost;
        this.damage = damage;
        this.armor = armor;
    }

    public int getCost() {
        return cost;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }
}
