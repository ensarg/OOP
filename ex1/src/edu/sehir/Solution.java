package edu.sehir;
import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {


        int  byteMin = Byte.MIN_VALUE;//0x80;
        int  byteMax = Byte.MAX_VALUE;// 0x7F;
        int    shortMin = 0x8000;
        int    shortMax = 0x7FFF;
         long  intMin = 0x8000_0000L;
         long  intMax = 0x7FFF_FFFFL;
         long  longMin = 0x8000_0000_0000_0000L;
         long  longMax = 0x7000_0000_0000_0000L;

        String input = " 5\n" +
                "-150\n" +
                "150000\n" +
                "1500000000\n" +
                "213333333333333333333333333333333333\n" +
                "-100000000000000";
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(input);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                // if(x>=-128 && x<=127)System.out.println("* byte");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");


            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
    }
}
/**
-150 can be fitted in:
        * short
        * int
        * long
        150000 can be fitted in:
        * int
        * long
        1500000000 can be fitted in:
        * int
        * long
        213333333333333333333333333333333333 can't be fitted anywhere.
        -100000000000000 can be fitted in:
        * long
 */