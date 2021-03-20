package net.mitwaldt.aoc.year2015.day21;

import java.util.List;

public class Player {
    private final String name;
    private int hitPoints;
    private final int damage;
    private final int armor;
    private final int cost;

    public Player(String name, int initialHitPoints, Weapon weapon, Armor armor, List<Ring> rings) {
        this.name = name;
        this.damage = weapon.getDamage() + rings.stream().mapToInt(Ring::getDamage).sum();
        this.armor = armor.getArmor() + rings.stream().mapToInt(Ring::getArmor).sum();
        this.cost = weapon.getCost() + armor.getCost() + rings.stream().mapToInt(Ring::getCost).sum();
        this.hitPoints = initialHitPoints;
    }

    public Player(String name, int hitPoints, int damage, int armor) {
        this.name = name;
        this.damage = damage;
        this.armor = armor;
        this.cost = 0;
        this.hitPoints = hitPoints;
    }

    int getDamage() {
        return damage;
    }

    int getArmor() {
        return armor;
    }

    int getCost() {
        return cost;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void attack(Player enemy) {
        enemy.hitPoints -= Math.max(1, getDamage() - enemy.getArmor());
    }

    @Override
    public String toString() {
        return name + "{" +
                "hitPoints=" + hitPoints +
                ", damage=" + damage +
                ", armor=" + armor +
                ", cost=" + cost +
                '}';
    }
}
