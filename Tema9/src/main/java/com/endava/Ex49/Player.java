package com.endava.Ex49;

import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'}";
    }

    @Override
    public List<String> write() {
        return List.of(name, String.valueOf(hitPoints), String.valueOf(strength), weapon);
    }

    @Override
    public void read(List<String> listOfValuesToBeStored) {
        if (listOfValuesToBeStored != null && listOfValuesToBeStored.size() > 0) {
            name = listOfValuesToBeStored.get(0);
            hitPoints = Integer.parseInt(listOfValuesToBeStored.get(1));
            strength = Integer.parseInt(listOfValuesToBeStored.get(2));
            weapon = listOfValuesToBeStored.get(3);
        }
    }
}

