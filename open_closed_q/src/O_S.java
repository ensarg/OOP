public class O_S {
   /*
   private PaymentMethod paymentMethod;

   OnlineShop(PaymentMethod paymentMethod) {
      this.paymentMethod = paymentMethod;
   }

   void checkout(double amount) {
      paymentMethod.pay(amount);
   }

    */


   private C_C c_c;
   private P_Py py;

   O_S(C_C c_c, P_Py py) {
      this.c_c = c_c;
      this.py = py;
   }

   void c_out(double aaa) {
      if (c_c != null) {
         c_c.py(aaa);
      } else if (py != null) {
         py.py(aaa);
      }
   }

}
