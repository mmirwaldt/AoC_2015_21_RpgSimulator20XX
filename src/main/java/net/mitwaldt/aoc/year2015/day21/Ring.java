package net.mitwaldt.aoc.year2015.day21;

public enum Ring implements Item {
    DAMAGE_PLUS_1(25, 1, 0),
    DAMAGE_PLUS_2(50, 2, 0),
    DAMAGE_PLUS_3(100, 3, 0),
    DEFENSE_PLUS_1(20, 0, 1),
    DEFENSE_PLUS_2(40, 0, 2),
    DEFENSE_PLUS_3(80, 0, 3);

    private final EnumItem item;

    Ring(int cost, int damage, int armor) {
        this.item = new EnumItem(cost, damage, armor);
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
