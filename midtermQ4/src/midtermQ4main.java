public class midtermQ4main {

   public static void main(String[] args) {

      Address personAddress = new Address("Büyükbakkalköy Yolu Sk. No:39", "Maltepe", "Istanbul", "34857");

      Person person = new Person("Ahmet ", personAddress);

      System.out.println(person.toString());
   }

}
