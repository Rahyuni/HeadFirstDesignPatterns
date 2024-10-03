package start1;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza.PizzaBuilder()
                .dough("Thin Crust")
                .sauce("Tomato")
                .topping("Cheese")
                .build();

        System.out.println(myPizza);

        // ----- if else 문으로 토핑 조절 -----
        /*
        String orderType = "Veggie";

        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder().dough("Regular");

        pizzaBuilder.sauce("Basil Pesto");

        if (orderType.equals("Veggie")) {
            pizzaBuilder.topping("Vegetables");
        } else {
            pizzaBuilder.topping("Pepperoni");
        }

        Pizza veggiePizza = pizzaBuilder.build();
        System.out.println(veggiePizza);
        */
    }
}
