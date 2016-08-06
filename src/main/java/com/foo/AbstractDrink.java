package com.foo;

abstract class AbstractDrink implements Drink {
    private final DrinkType type;

    protected AbstractDrink(DrinkType type) {
        this.type = type;
    }

    public String toDrinkMakerProtocol() {
        return String.format("%s", type.id);
    }
}
