package tr.maltepe.edu;

public class Teststaticvar {

      public static void main(String[] args) {

            Bicycle b1,b2,b3;

             b1 = new Bicycle("red", 1);

             b2 = new Bicycle("blue", 2);

             b3 = new Bicycle("green", 3);

             b1.ride();
             b2.ride();
             b3.ride();

         System.out.println("number of bicycles  "+ b1.getnumberofbikes());


         System.out.println("number of bicycles  "+ Bicycle.getNumberOfBicycles());

         //System.out.println("number of gears  "+ Bicycle.getGear());

         //  System.out.println("number of bicycles ---:   "+ Bicycle.);



      }
}