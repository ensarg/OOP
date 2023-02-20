public class TestOnlineShop {

  public static void main(String[] args) {
    CreditCard cc = new CreditCard("1234-5678-9012-3456", "12/2020", "123");
    PayPal pal = new PayPal("myname@maltepe.edu.tr","mypassword");
    OnlineShop shop = new OnlineShop(cc,  null);

      shop.checkout(100.0);
  }
}
