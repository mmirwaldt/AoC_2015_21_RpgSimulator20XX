package net.mitwaldt.aoc.year2015.day21;

public enum Armor {
    NO_ARMOR(0, 0),
    LEATHER(13, 1),
    CHAINMAIL(31, 2),
    SPLINTMAIL(53, 3),
    BANDEDMAIL(75, 4),
    PLATEMAIL(102, 5);

    private final int cost;
    private final int armor;

    Armor(int cost, int armor) {
        this.cost = cost;
        this.armor = armor;
    }

    public int getCost() {
        return cost;
    }

    public int getArmor() {
        return armor;
    }
}
