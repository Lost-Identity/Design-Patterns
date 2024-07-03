package ToppingsDecorator;

import Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        int extraCheese = 25;
        return this.basePizza.cost() + extraCheese;
    }
}
