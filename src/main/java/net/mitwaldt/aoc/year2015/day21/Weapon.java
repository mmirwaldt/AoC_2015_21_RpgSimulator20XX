package net.mitwaldt.aoc.year2015.day21;

public enum Weapon implements Item {
    DAGGER(8, 4),
    SHORTSWORD(10, 5),
    WARHAMMER(25, 6),
    LONGSWORD(40, 7),
    GREATAXE(74, 8);

    private final EnumItem item;

    Weapon(int cost, int damage) {
        this.item = new EnumItem(cost, damage, 0);
    }

    @Override
    public int getCost() {
        return item.getCost();
    }

    @Override
    public int getDamage() {
        return item.getDamage();
    }

    @Override
    public int getArmor() {
        return item.getArmor();
    }
}
