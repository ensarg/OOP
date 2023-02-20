public class PayPal {
   private String email;
   private String password;

   PayPal(String email, String password) {
      this.email = email;
      this.password = password;
   }


   public void pay(double amount) {
      // Implementation to make a payment through PayPal
      System.out.println("Payment of " + amount + " made through PayPal");
   }
}
