package com.endava.Ex49;

import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        return List.of(name, String.valueOf(hitPoints), String.valueOf(strength));
    }

    @Override
    public void read(List<String> listOfValuesToBeStored) {
        if (listOfValuesToBeStored != null && listOfValuesToBeStored.size() > 0) {
            name = listOfValuesToBeStored.get(0);
            hitPoints = Integer.parseInt(listOfValuesToBeStored.get(1));
            strength = Integer.parseInt(listOfValuesToBeStored.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
}
