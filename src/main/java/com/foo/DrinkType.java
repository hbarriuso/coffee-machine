package com.foo;

public enum DrinkType {
    TEA('T');

    public final char id;

    DrinkType(char id) {
        this.id = id;
    }
}
