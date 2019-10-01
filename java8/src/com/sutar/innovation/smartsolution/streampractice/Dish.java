package com.sutar.innovation.smartsolution.streampractice;
/*
*  POJO CLASS for the streaming functionality
* */
public class Dish {
    private final String name;
    private final boolean vegetarioan;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarioan, int calories, Type type) {
        this.name = name;
        this.vegetarioan = vegetarioan;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarioan() {
        return vegetarioan;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }
    public String toString()
    {
        return name;
    }
    public enum Type { MEAT, FISH, OTHER}

}
