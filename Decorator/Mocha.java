public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.description = beverage.getDescription() + ", Mocha";
    }

    @Override
    double cost() {
        return beverage.cost() + 0.2;
    }
}
