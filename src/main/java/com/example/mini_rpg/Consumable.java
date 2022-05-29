package com.example.mini_rpg;

public class Consumable {
    private int lifepoints;
    private int manapoints;
    private String name;
    private String type;
    public Consumable(String name, int lifepoints, int manapoints, String type) {
        this.lifepoints= lifepoints;
        this.name=name;
        this.manapoints=manapoints;
        this.type=type;

    }
    public int getLifepoints() {
        return lifepoints;
    }
    public int getManapoints() {
        return manapoints;
    }
    public String getName() {
        return name;
    }
}
