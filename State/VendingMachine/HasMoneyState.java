package VendingMachine;

public class HasMoneyState implements State {

    private final VendingMachine vendingMachine;

    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Not Supported");
    }

    @Override
    public void addProduct(int code) {

    }

    @Override
    public void removeProduct(int code) {

    }

    @Override
    public void placeOrder() {

    }

    @Override
    public void returnChange() {
        System.out.println("Not Supported");
    }

    @Override
    public void cancelOrder() {

    }
}
