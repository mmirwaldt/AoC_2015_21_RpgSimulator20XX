package net.mitwaldt.aoc.year2015.day21;

public enum Weapon {
    DAGGER(8, 4),
    SHORTSWORD(10, 5),
    WARHAMMER(25, 6),
    LONGSWORD(40, 7),
    GREATAXE(74, 8);

    private final Item item;

    Weapon(int cost, int damage) {
        this.item = new Item(cost, damage, 0);
    }

    public int getCost() {
        return item.getCost();
    }

    public int getDamage() {
        return item.getDamage();
    }
}
