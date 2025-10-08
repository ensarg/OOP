package tr.edu.maltepe.oop;

public class PrintA {

    public static  < E > void printArrayA( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    /*
      public static  < E > void printArrayB( E[] inputArray ) {
          System.out.println(" the array pointer: ");
          System.out.printf("%s",inputArray.toString()); //
          System.out.println("\nelements of the array are: ");
          for(E element : inputArray) {
              System.out.printf("%s ",element);
          }

         //System.out.printf("%s",element.getClass().getName());
         System.out.println();
      }
    */

}

