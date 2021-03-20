package net.mitwaldt.aoc.year2015.day21;

public enum Armor {
    NO_ARMOR(0, 0),
    LEATHER(13, 1),
    CHAINMAIL(31, 2),
    SPLINTMAIL(53, 3),
    BANDEDMAIL(75, 4),
    PLATEMAIL(102, 5);

    private final Item item;

    Armor(int cost, int armor) {
        this.item = new Item(cost, 0, armor);
    }

    public int getCost() {
        return item.getCost();
    }

    public int getArmor() {
        return item.getArmor();
    }
}
