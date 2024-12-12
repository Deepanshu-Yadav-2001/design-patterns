package VendingMachine;

public interface State {
    void insertMoney(double amount);
    void addProduct(int code);
    void removeProduct(int code);
    void placeOrder();
    void returnChange();
    void cancelOrder();
}
