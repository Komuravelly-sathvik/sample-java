import java.util.Date;


/// dlkcjndckjnds
class PaymentMethod {
    float amount;
    String transactionId;
    Date paymentDate;
    String currency;

    PaymentMethod(String transactionId, float amount, Date paymentDate, String currency) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.currency = currency;
    }


    void showTransactionDetails() {
        System.out.println("Transaction ID: " + transactionId + " | Amount: " + amount + " | Currency: " + currency + " | Date: " + paymentDate);
    }
}

// CreditCardPayment extends PaymentMethod and implements Payment interface
class CreditCardPayment extends PaymentMethod implements Payment {
    String creditCardNumber;
    String expirationDate;


    CreditCardPayment(String transactionId, float amount, Date paymentDate, String currency, String creditCardNumber, String expirationDate) {
        super(transactionId, amount, paymentDate, currency);
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void processPayment() {
        showTransactionDetails();
        System.out.println("Processing credit card payment of " + amount + " from card: " + creditCardNumber);
    }
}

class PayPalPayment extends PaymentMethod implements Payment {
    String paypalAccount;
    float transactionFee;

    PayPalPayment(String transactionId, float amount, Date paymentDate, String currency, String paypalAccount, float transactionFee) {
        super(transactionId, amount, paymentDate, currency);
        this.paypalAccount = paypalAccount;
        this.transactionFee = transactionFee;
    }

    @Override
    public void processPayment() {
        showTransactionDetails();
        System.out.println("Processing PayPal payment of " + amount + " from account: " + paypalAccount + " with a transaction fee of " + transactionFee);
    }
}

public class Main {
    public static void main(String[] args) {
        Date paymentDate1 = new Date();
        Payment credit = new CreditCardPayment("qwerty123", 100.0f, paymentDate1, "USD", "1234-5678-9012-3456", "12/25");
        credit.processPayment();

        Date paymentDate2 = new Date();
        Payment payPal = new PayPalPayment("asdfgh456", 50.0f, paymentDate2, "USD", "user@example.com", 2.0f);
        payPal.processPayment();
        System.out.println("dfghjkl");
    }
}
