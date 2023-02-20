public class OnlineShop {
   /*
   private PaymentMethod paymentMethod;

   OnlineShop(PaymentMethod paymentMethod) {
      this.paymentMethod = paymentMethod;
   }

   void checkout(double amount) {
      paymentMethod.pay(amount);
   }

    */


   private CreditCard creditCard;
   private PayPal payPal;

   OnlineShop(CreditCard creditCard, PayPal payPal) {
      this.creditCard = creditCard;
      this.payPal = payPal;
   }

   void checkout(double amount) {
      if (creditCard != null) {
         creditCard.pay(amount);
      } else if (payPal != null) {
         payPal.pay(amount);
      }
   }

}
