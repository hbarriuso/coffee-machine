package com.foo;

public enum DrinkType {
    TEA('T'), COFFEE('C');

    public final char id;

    DrinkType(char id) {
        this.id = id;
    }
}
