package tr.edu.maltepe.oop;

public class CSStudent extends Student{
   private String programmingLanguage;
      private String operatingSystem;
      private String database;
      private String webTechnology;
      private String network;
      private String softwareEngineering;

      public CSStudent(int id, String name, String surname, int age){
         super(id, name, surname, age); // email, phone, address, city, country);

      }

      public void setProgrammingLanguage(String programmingLanguage){
         this.programmingLanguage = programmingLanguage;
      }
}



