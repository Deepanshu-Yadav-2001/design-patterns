import java.time.LocalDate;

public class CreditCardPayment implements PaymentStrategy {
    long cardNumber;
    LocalDate expirationDate;
    int cvv;

    public CreditCardPayment(long cardNumber, LocalDate expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void process(double amount) {
        System.out.printf("Amount %s transferred from credit card ending with %s%n", amount, cardNumber % 10000);
    }
}
