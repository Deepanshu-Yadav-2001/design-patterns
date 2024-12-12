import java.util.Objects;

public class PaymentContext {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(Double amount) {
        if (Objects.isNull(paymentStrategy)) {
            throw new RuntimeException("Payment method not set");
        }
        paymentStrategy.process(amount);
    }
}
