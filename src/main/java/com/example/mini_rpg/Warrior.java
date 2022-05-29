package com.example.mini_rpg;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name, 50, 30, 20, 0,"Warrior");
    }

    @Override
    public  int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public void useconsumable(Consumable consumable) {

    }
}
