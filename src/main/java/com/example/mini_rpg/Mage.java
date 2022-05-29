package com.example.mini_rpg;

public class Mage extends SpellCaster{

    public Mage(String name) {
        super(name, 25, 15, 40, "SpellCaster",100 , "Mage");
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
