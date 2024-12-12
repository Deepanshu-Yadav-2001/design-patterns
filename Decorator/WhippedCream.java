public class WhippedCream extends CondimentDecorator {
    Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
        this.description = beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    double cost() {
        return beverage.cost() + 0.1;
    }
}
