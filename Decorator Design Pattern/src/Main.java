import Pizza.BasePizza;
import Pizza.Farmhouse;
import Pizza.Margherita;
import ToppingsDecorator.ExtraCheese;
import ToppingsDecorator.Jalapeno;
import ToppingsDecorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Farmhouse();
        System.out.println(pizza.cost());

        BasePizza pizza1 = new ExtraCheese(new Farmhouse());
        System.out.println(pizza1.cost());

        BasePizza pizza2 = new Jalapeno(new ExtraCheese(new Farmhouse()));
        System.out.println(pizza2.cost());

        BasePizza pizza3 = new Mushroom(new Jalapeno(new ExtraCheese(new Margherita())));
        System.out.println(pizza3.cost());
    }
}