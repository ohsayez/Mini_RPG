package com.example.mini_rpg;

public class Healer extends SpellCaster{
    public Healer(String name) {
    super(name, 20, 15, 20,"SpellCaster" ,100,"Healer");
}
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public  int defend() {
        return 0;
    }

    @Override
    public void useconsumable(Consumable consumable) {

    }
}
