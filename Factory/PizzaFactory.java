public class PizzaFactory {
    public Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "veggie" -> new VeggiePizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> null;
        };
    }
}