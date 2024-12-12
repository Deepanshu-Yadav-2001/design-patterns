package VendingMachine;

import java.util.List;

public class VendingMachine {
    private final State idleState;
    private final State hasMoneyState;
    private final State dispensingState;
    private final State returnChangeState;
    private State currentState;
    private double money;
    private Cart cart;
    private Inventory inventory;

    public VendingMachine() {
        idleState = new IdleState(this);
        hasMoneyState = new HasMoneyState(this);
        dispensingState = new DispensingState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
        money = 0;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public State getReturnChangeState() {
        return returnChangeState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public double getMoney() {
        return money;
    }

    public void addMoney(double amount) {
        money += amount;
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }

    public void setCurrentState(State state) {
        currentState = state;
    }

    public void cancel() {
        System.out.println("Cancelling the order");

    }

}
