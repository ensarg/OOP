package edu.sehir.oop;




public class testSingleton {

    public static void main(String[] args) {


         //classic singleton
          /*
         ClassicSingleton s1=null, s2=null;

         s1=ClassicSingleton.getInstance();

         s1.writeName();
         System.out.println("s1_id " + s1);
         System.out.println("instance_counter " + ClassicSingleton.instance_counter);
         s2=ClassicSingleton.getInstance();
         s2.writeName();
         System.out.println("s2_id " + s2);
         System.out.println("instance_counter " + ClassicSingleton.instance_counter);

          */

        /**
        * better singleton
        Singleton s1, s2;

        s1=Singleton.getInstance();
        s1.writeName();
        System.out.println("s1_id " + s1.hashCode());
        System.out.println("instance_counter " + Singleton.instance_counter);
        s2=Singleton.getInstance();
        s2.writeName();
        System.out.println("s2_id " + s2.hashCode());
        System.out.println("instance_counter " + Singleton.instance_counter);
*/

        //not sıngleton
        notSingleton s1, s2;
        s1=notSingleton.getInstance();
        s1.writeName();
        System.out.println("s1_id " + s1.hashCode());
        System.out.println("instance_counter " + notSingleton.instance_counter);
        s2=notSingleton.getInstance();
        s2.writeName();
        System.out.println("s2_id " + s2.hashCode());
        System.out.println("instance_counter " + notSingleton.instance_counter);


    }
}
