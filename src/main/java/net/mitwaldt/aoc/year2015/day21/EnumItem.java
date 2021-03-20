package net.mitwaldt.aoc.year2015.day21;

public class EnumItem implements Item {
    private final int cost;
    private final int damage;
    private final int armor;

    public EnumItem(int cost, int damage, int armor) {
        this.cost = cost;
        this.damage = damage;
        this.armor = armor;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getArmor() {
        return armor;
    }
}
