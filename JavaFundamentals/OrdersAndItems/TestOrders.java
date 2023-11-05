import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.99;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 5.99;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 3.99;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 3.49;


        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = item1.price;
        order1.ready = false;
        order1.items.add(item1);

        Order order2 = new Order();
        order2.name = "Jimmy";
        
        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        System.out.println(order1);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
