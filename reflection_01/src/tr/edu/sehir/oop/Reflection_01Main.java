package tr.edu.sehir.oop;

public class Reflection_01Main {



    public static void main(String args[])
    {
        int status=0;
        ShowReflection_02 shr = new ShowReflection_02();
        if (args.length != 1) {
            System.out.println("Pls enter name of the class");
            System.exit(status);
        }

        //System.out.println("arg 0: " +args[0]);
       shr.DumpMethods(args[0]);
        //shr.DumpMethods(args[0]);

      // shr.DumpMethods("java.lang.String");
      //  shr.printClassName(shr);

    }


}
