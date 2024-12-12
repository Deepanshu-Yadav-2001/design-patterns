public class Decaf extends Beverage {

    Decaf() {
        description = "Decaf";
    }

    @Override
    double cost() {
        return 1.05;
    }
}
