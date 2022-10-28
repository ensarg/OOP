package tr.edu.maltepe.oop;

public class Inheritance_Example {

    public static void main(String[] args) {
	// write your code here

        Bicycle mybike = new Bicycle(10,4);
        MountainBike yourbike = new MountainBike(100,10,4);


       // mybike.speedUp(2);
       // yourbike.speedUp(2);

        System.out.println("-----------------");

      //  yourbike =   mybike; //??????
      //  yourbike.speedUp(2);  //calls the method of parent class

        //yourbike.printH();


        System.out.println("-----------------");
        mybike = yourbike;
        mybike.speedUp(4);  //calls the method of child class

        //yourbike.setGear(4);



    }
}
