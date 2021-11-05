package edu.sehir.oop;

public class Builder1 {


    public static void main(String[] args) {
	//Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp1 = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

        Computer comp2 = new Computer.ComputerBuilder(
                "500 GB", "2 GB").build();

        System.out.println("Computer 1: \nhardisk: "+ comp1.getHDD()+"\nram: "+ comp1.getRAM()+
                "\nbluetooth ? : "+ comp1.isBluetoothEnabled()+ "\ngraphiccard ? : "+comp1.isGraphicsCardEnabled());

        System.out.println("Computer 2: \nhardisk: "+ comp2.getHDD()+"\nram: "+ comp2.getRAM()+
                "\nbluetooth ? : "+ comp2.isBluetoothEnabled()+ "\ngraphiccard ? : "+comp2.isGraphicsCardEnabled());
    }
}
