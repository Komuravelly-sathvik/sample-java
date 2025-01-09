interface Payment {
    void processPayment();
    default void showPaymentDetails(){
        System.out.println("The details will be shown...");
    }
}