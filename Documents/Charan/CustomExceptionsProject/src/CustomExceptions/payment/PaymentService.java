package CustomExceptions.payment;

import CustomExceptions.exception.InvalidPaymentException;

public class PaymentService {

    public void processPayment(double amount)
            throws InvalidPaymentException {

        if (amount <= 0) {
            throw new InvalidPaymentException("Invalid payment amount");
        }

        System.out.println("Payment successful: " + amount);
    }
}