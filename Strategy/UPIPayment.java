public class UPIPayment implements PaymentStrategy {
    String vpa;

    public UPIPayment(String vpa) {
        this.vpa = vpa;
    }

    @Override
    public void process(double amount) {
        System.out.printf("Amount %s transferred from virtual payment address %s through UPI%n", amount, vpa);
    }
}
