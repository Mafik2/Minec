package com.company;

public class CraftingTable extends Block implements IRightClick{


    public CraftingTable(String name, int durability, String sound) {
        super(name, durability, sound);
    }

    @Override
    public void blockSound() {
        System.out.println("Crafting sound");
    }
    @Override
    public void click() {
        System.out.println("Start crafting...");
    }
}
