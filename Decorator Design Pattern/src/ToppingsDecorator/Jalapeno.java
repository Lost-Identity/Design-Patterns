package ToppingsDecorator;

import Pizza.BasePizza;

public class Jalapeno extends ToppingDecorator{

    BasePizza basePizza;

    public Jalapeno(BasePizza pizza){
        this.basePizza = pizza;
    }


    @Override
    public int cost() {
        int jalapeno = 30;
        return this.basePizza.cost() + jalapeno;
    }
}
