package tr.edu.maltepe.oop;

public class PrintA {

    public static  < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}

