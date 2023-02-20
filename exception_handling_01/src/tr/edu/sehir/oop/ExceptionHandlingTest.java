package tr.edu.sehir.oop;

public class ExceptionHandlingTest {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        ExceptionExamples exp= new ExceptionExamples();

        try
       {
            int result;
            result = exp.computeDivision(a,b);
            System.out.println("the result is: "+ result);
        }
        //matching ArithmeticException
        catch(ArithmeticException ex)
        {
            // getMessage will print description of exception(here / by zero)
            System.out.println(ex.getMessage());
        }


        System.out.println("\n**********************************");

        /*
        try {

            exp.arrayBoundtest();
        }
        catch (ArrayIndexOutOfBoundsException ax){
            System.out.println("printing the error message " +ax.getMessage());
        }
         /*
        catch (java.lang.Exception exc){
            System.out.println(exc.getMessage());
        }
        */
    }
}
