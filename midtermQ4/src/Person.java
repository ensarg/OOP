public class Person {

   //test git push
   private String name;
   private Address address;
   public Person(String name, Address address) {
      this.name = name;
      this.address = address;
   }

   public String getName() {      return name;}

   public Address getAddress() {   return address;}

   public String toString() {
      return "Person: " + name + "\n" + address;
   }

}
