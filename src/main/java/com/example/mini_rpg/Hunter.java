package com.example.mini_rpg;

public class Hunter extends Hero{
    private int arrows;

    public Hunter(String name) {
        super(name, 30, 20, 30, 40,"Hunter");
    }

    @Override
    public int attack() {
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
