public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.description = beverage.getDescription() + ", Milk";
    }

    @Override
    double cost() {
        return beverage.cost() + 0.1;
    }
}
