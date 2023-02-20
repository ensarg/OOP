public class CreditCard {

   private String cardNumber;
   private String expiryDate;
   private String cvv;

   CreditCard(String cardNumber, String expiryDate, String cvv) {
      this.cardNumber = cardNumber;
      this.expiryDate = expiryDate;
      this.cvv = cvv;
   }


   public void pay(double amount) {
      // Implementation to charge the payment from the credit card
      System.out.println("Payment of " + amount + " made through credit card");
   }
}
