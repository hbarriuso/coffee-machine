package com.foo;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.startsWith;

public class CoffeeMachineTest {
    @Rule
    public JUnitRuleMockery context = new JUnitRuleMockery();

    private DrinkMaker drinkMaker = context.mock(DrinkMaker.class);
    private CoffeeMachine machine = new CoffeeMachine(drinkMaker);

    @Test
    public void make_a_tea() {
        final String expectedStart = "T";
        final Drink tea = new Tea();

        context.checking(new Expectations() {{
            oneOf(drinkMaker).receive(with(startsWith(expectedStart)));
        }});

        machine.order(tea);
    }
}
