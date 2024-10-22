package tr.edu.maltepe.oop;

public class Student {
   int id;
   String name;
   String surname;
   int age;
   String department;
   String email;
   String phone;
   String address;
   String city;
   String country;

   public Student(int id, String name, String surname, int age)
   {
      this.id = id;
      this.name = name;
      this.surname = surname;
      this.age = age;

   }

   public void setId(int id) {
      this.id = id;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setSurname(String surname) {
      this.surname = surname;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public void setDepartment(String department) {
      this.department = department;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   public void setAddress(String address) {
      this.address = address;
   }
}
