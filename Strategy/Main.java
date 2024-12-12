import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Process payment using Credit Card
        context.setPaymentStrategy(new CreditCardPayment(178390273901L, LocalDate.of(2028, 4, 13), 546));
        context.processPayment(100.0);

        // Process payment using UPI
        context.setPaymentStrategy(new UPIPayment("kabutar@hdrt"));
        context.processPayment(200.0);

        // Process payment using Net Banking
        context.setPaymentStrategy(new NetBankingPayment("user56"));
        context.processPayment(300.0);
    }
}
