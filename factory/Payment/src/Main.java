public class Main {
    public static void main(String[] args) {
        FinancialInfo userInfo = new FinancialInfo(
                "1234-5678-1234-5678", "user@gmail.com", "9038472-3753948"
        );

        PaymentFactory factory = new CreditCardPaymentFactory();
        Payment payment = factory.createPayment(userInfo);
        payment.processPayment(100.0);

        factory = new PayPalPaymentFactory();
        payment = factory.createPayment(userInfo);
        payment.processPayment(200.0);

        factory = new BankTransferPaymentFactory();
        payment = factory.createPayment(userInfo);
        payment.processPayment(300.0);
    }
}
