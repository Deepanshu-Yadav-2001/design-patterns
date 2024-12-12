package VendingMachine;

public class IdleState implements State {
    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Rs " + amount + " inserted in the machine");
        vendingMachine.setCurrentState(vendingMachine.getHasMoneyState());
    }

    @Override
    public void addProduct(int code) {
        System.out.println("Please add money first");
    }

    @Override
    public void removeProduct(int code) {
        System.out.println("Please add money first");
    }

    @Override
    public void placeOrder() {
        System.out.println("Not Supported");
    }

    @Override
    public void returnChange() {
        System.out.println("Not Supported");
    }

    @Override
    public void cancelOrder() {
        System.out.println("You haven't placed an order");
    }
}
