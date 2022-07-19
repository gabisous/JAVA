package dev.gabialves.app.models.machines;

import dev.gabialves.app.models.products.Chocolate;
import dev.gabialves.app.models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine {
    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }
}
