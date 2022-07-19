package dev.gabialves.app.models.machines;

import dev.gabialves.app.models.products.Coffee;
import dev.gabialves.app.models.products.HotDrink;
public class CoffeeMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }
}
