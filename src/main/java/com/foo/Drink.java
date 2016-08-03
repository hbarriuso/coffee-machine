package com.foo;

abstract class Drink {
    private final DrinkType type;

    protected Drink(DrinkType type) {
        this.type = type;
    }

    public String toDrinkMakerProtocol() {
        return String.format("%s", type.id);
    }
}
