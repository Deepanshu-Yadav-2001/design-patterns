public class NetBankingPayment implements PaymentStrategy {
    String userId;

    public NetBankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void process(double amount) {
        System.out.printf("Amount %s transferred from user %s through net banking %n", amount, userId);
    }
}
