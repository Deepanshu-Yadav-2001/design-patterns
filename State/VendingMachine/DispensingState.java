package VendingMachine;

public class DispensingState implements State {

    private final VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(double amount) {

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

    }

    @Override
    public void cancelOrder() {

    }
}
