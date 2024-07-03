package ToppingsDecorator;

import Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        int mushroom = 20;
        return this.basePizza.cost() + mushroom;
    }
}
