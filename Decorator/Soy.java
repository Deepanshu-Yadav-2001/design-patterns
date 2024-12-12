public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.description = beverage.getDescription() + ", Soy";
    }

    @Override
    double cost() {
        return beverage.cost() + 0.15;
    }
}
