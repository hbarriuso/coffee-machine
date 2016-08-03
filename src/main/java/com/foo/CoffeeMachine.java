package com.foo;

public class CoffeeMachine {
    private final DrinkMaker drinkMaker;

    public CoffeeMachine(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    public void order(Drink drink) {
        drinkMaker.receive(drink.toDrinkMakerProtocol());
    }
}
