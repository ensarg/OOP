package tr.edu.maltepe.oop;

import java.util.*;

public class Test_Generics_01 {

    public static void main(String[] args) {
       /*
    //section 1
        ArrayList<String > list = new ArrayList<String >();

        list.add("xyzxghfhgfghf");
        list.add("mnbbvvcxz");
        list.add("gfgfffjjfjfjj");
        list.add("oop class");

        list.add(32);
        list.add(45);
        list.add(50);

       String s = list.get(1);//type casting is not required
        // System.out.println("element is: " + s);

        System.out.println("elements of arraylist list are: " );

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
      */
      //end of section 1-------------------------------------------------------------------------
      /*
        //section 2

        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"ali");
        map.put(4,"veli");
       map.put(2,34);//compile error

        //Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer,String>> set=map.entrySet();

        Iterator<Map.Entry<Integer,String>> itr2=set.iterator();
        while(itr2.hasNext()){
            Map.Entry e=itr2.next();//no need to typecast
            System.out.println(e.getKey()+" "+e.getValue());
        }


        */
        //end of section 2--------------------------------------------------------------------


        //section 3

       /*
        GenericBox <Integer> m=new GenericBox<Integer>();
        m.set(2);
        //m.set("etcjkjh");//Compile time error
        System.out.println(m.get());
        m.genericDisplay(m.get());
      */
        //end of section 3 ---------------------------------------------------------------------------------

        //section 4

         /*
        GenericBox2 <String, String> obj =
                new GenericBox2<String, String>("ensar", "GUL");

        obj.print();

        GenericBox2 <String, Float> obj_1 =
                new GenericBox2<String, Float>("ensar", (float)3.14);

        obj_1.print();



        GenericBox <String> obj2 =
                new GenericBox<String>();
        obj2.set("ensar gul");

        obj2.genericDisplay(obj2.get());

        GenericBox <Float> obj3 =
                new GenericBox<Float>();
        obj3.set((float)3.14);

        obj3.genericDisplay(obj3.get());
        */
        // end of section 4----------------------------------------------------------------------------

        // section 5
        // not using generics may cause run time exceptions

        /*
        ArrayList al = new ArrayList();

        al.add("Ahmet");
        al.add("Mehmet");
        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);

        // Causes Runtime Exception
        String s3 = (String)al.get(2);


        */
       //end of section 5-------------------------------------------------------------

        // section 6
         /*

        // Creating a an ArrayList with String specified

        ArrayList <String> al2 = new ArrayList<String> ();

        al2.add("yan yana ");
        al2.add("yazıyor işte    ");

        // Now Compiler doesn't allow this
        al2.add(10);

        String s1 = (String)al2.get(0);
        String s2 = (String)al2.get(1);
       // String s3 = (String)al2.get(2);
        System.out.println(s1 +s2);
        */

        //end of section 6--------------------------------------------------------------------------------------

        // section 7
         /*

        // We don't need to typecast individual members of ArrayList

        // Creating an ArrayList with String specified

        ArrayList <String> al3 = new ArrayList<String> ();

        al3.add("Ahmet  ");
        al3.add("Mehmet");

        // Typecasting is not needed
        String s1 = al3.get(0);
        String s2 = al3.get(1);

        System.out.println(s1 +s2);
        */
        //end of section 7------------------------------------------------------------------------

        // section 8
         /*

        //invoking generic method, try different keys and values
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "apple");
        boolean same = GUtility.<Integer, String>compare(p1, p2);

        System.out.println("\npairs are equal? "+same);

        System.out.println("\n-------------------------------------------------------------------------\n");

        Pair<Integer, Float> p3 = new Pair<>(1, (float)3.14);
        Pair<Integer, Float> p4 = new Pair<>(1, (float)3.14);
        boolean same2 = GUtility.<Integer, Float>compare(p3, p4);

        System.out.println("\npairs are equal? "+same2);

        System.out.println("\n-------------------------------------------------------------------------\n");

        Pair<String, String> p5 = new Pair<>("ahmet", "mehmet");
        Pair<String, String> p6 = new Pair<>("ahmet", "mehmet");
        boolean same3 = GUtility.<String, String>compare(p5, p6);

        System.out.println("\npairs are equal? "+same3);

         */
        //end of section 8-------------------------------------------------------------

        // section 9
        //print an array of different type using a single Generic method printArray
       /*

        Integer[] intArray = { 1, 2, 3, 4, 5 };

        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };

        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        PrintA.printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        PrintA.printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        PrintA.printArray(charArray);   // pass a Character array

        //

        Book b1=new Book(113,"OOPogrammimg");
        Book b2 =new Book(114, "Programming in Java");

        Book [] bookArray={b1,b2};

        System.out.println("\nArray bookArray  contains:");
        PrintA.printArray(bookArray);   // pass objects

        */
        //end of section 9----------------------------------------------------------------------------------






    }
}
