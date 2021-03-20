package net.mitwaldt.aoc.year2015.day21;

public class Item {
    private final int cost;
    private final int damage;
    private final int armor;

    public Item(int cost, int damage, int armor) {
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
