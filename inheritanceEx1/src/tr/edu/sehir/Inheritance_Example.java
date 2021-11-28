package tr.edu.sehir;

public class Inheritance_Example {

    public static void main(String[] args) {
	// write your code here

        Bicycle mybike = new Bicycle(10,4);
        Bicycle yourbike = new MountainBike(100,4,4);



        //mybike.speedUp(2);
        //yourbike.speedUp(2);
/*
        yourbike = mybike; //??????
        yourbike.speedUp(2);  //calls the method of parent class
        yourbike.printH();
*/
        mybike = yourbike;
        mybike.speedUp(2);  //calls the method of child class

       // yourbike.setGear(4);



    }
}
