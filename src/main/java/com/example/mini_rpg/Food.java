package com.example.mini_rpg;

public class Food extends Consumable {
    public Food(String name, int life, int manapoints) {
        super(name, life, manapoints, name);
    }
}