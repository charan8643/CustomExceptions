package CustomExceptions.main;

import CustomExceptions.user.UserService;
import CustomExceptions.product.Product;
import CustomExceptions.payment.PaymentService;
import CustomExceptions.exception.*;

public class MainApp {

    public static void main(String[] args) {

        UserService user = new UserService();
        Product product = new Product("Laptop", 5);
        PaymentService payment = new PaymentService();

        try {
            user.login("admin", "345");
            product.purchase(3);
            payment.processPayment(34567);
        }
        catch (AuthenticationFailedException e) {
            System.out.println("Login error: " + e.getMessage());
        }
        catch (OutOfStockException e) {
            System.out.println("Stock error: " + e.getMessage());
        }
        catch (InvalidPaymentException e) {
            System.out.println("Payment error: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction ended");
        }
    }
}