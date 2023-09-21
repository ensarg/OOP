package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        int [] numbers = {20,15,30,45,50};

        int x,y;

        try {

            y=0;
            x =numbers[0];
            System.out.println("\n x =" + x);

            x=x/y;

            System.out.println(" array \n");
            for (int number : numbers) {
                System.out.println(number);
            }

        }catch (Exception e){
            System.out.println(" there is an  exception");

        }

        System.out.println("my prg is executing...");

    }
}
