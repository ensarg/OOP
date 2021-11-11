package tr.edu.sehir.oop;

public class ExceptionThrown {


    // Java program to demonstrate exception is thrown
    // how the runTime system searches th call stack
// to find appropriate exception handler.

        // It throws the Exception(ArithmeticException).
        // Appropriate Exception handler is not found within this method.
         int divideByZero(int a, int b){

            // this statement will cause ArithmeticException(/ by zero)
            int i = a/b;

            return i;
        }

        // The runTime System searches the appropriate Exception handler
        // in this method also but couldn't have found. So looking forward
        // on the call stack.
        int computeDivision(int a, int b) {

            int res =0;

            try
            {
                res = divideByZero(a,b);

            }
            // doesn't matches with ArithmeticException
            catch(NumberFormatException ex)
            {
                System.out.println("NumberFormatException is occured");
            }
            return res;
        }

        void arrayBoundtest () throws ArrayIndexOutOfBoundsException {
            // array of size 4.
            int[] arr = new int[4];

            // this statement causes an exception
            int i = arr[4];
           // int res = divideByZero(1,0);

            // the following statement will never execute
            System.out.println("Hi, I want to execute");

        }

    }
