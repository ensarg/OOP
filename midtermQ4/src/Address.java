public class Address {
      private String street;
      private String town;
      private String city;
      private String postalCode;

      public Address(String street, String town, String city, String postalCode) {
         this.street = street;
         this.town = town;
         this.city = city;
         this.postalCode = postalCode;
      }

      public String toString() {
         return "Address: " + street + ", " + town + ", " + city + " " + postalCode;
      }
   }


