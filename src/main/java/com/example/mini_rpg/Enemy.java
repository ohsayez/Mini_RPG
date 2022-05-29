package com.example.mini_rpg;

public abstract class Enemy {
    private int lifePoints;
    private String type;
    private int armor;
    private int damage;
    private String name;
    private int maxpoints;

    public String getName() {
        return name;
    }
    public int getLifePoints() {
        return lifePoints;
    }
    public int getDamage() {
        return damage;
    }
    public int getArmor() {
        return armor;
    }
    public String toString() {
        return this.getName()+" : "+this.lifePoints;
    }
    public void modifieLifePoints(int lifePoints) {
        this.lifePoints -= lifePoints;
    }
    public void modifieArmor(int armor) {
        this.armor += armor;
    }
    public int getMaxpoints(){
        return maxpoints;
    }

    public Enemy (String name ,int lifePoints, String type,int armor,int damage) {
        this.name = name;
        this.lifePoints= lifePoints;
        this.armor=armor;
        this.damage=damage;
        this.type=type;
        this.maxpoints=lifePoints;
    }
}
