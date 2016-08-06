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
        order_drink_makes_drink_maker_receive_a_string_that_starts_with(new Tea(), "T");
    }

    @Test
    public void make_a_coffee() {
        order_drink_makes_drink_maker_receive_a_string_that_starts_with(new Coffee(), "C");
    }

    private void order_drink_makes_drink_maker_receive_a_string_that_starts_with(Drink drink, final String expectedStart) {
        context.checking(new Expectations() {{
            oneOf(drinkMaker).receive(with(startsWith(expectedStart)));
        }});

        machine.order(drink);
    }
}
