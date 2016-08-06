package com.foo;

public class Coffee extends AbstractDrink implements Drink {
    public Coffee() {
        super(DrinkType.COFFEE);
    }
}
