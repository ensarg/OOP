package edu.sehir.oop;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class scanInput {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("enter something:\n");
        while (sc.hasNext()) {
            System.out.println("input read:"+ ++i + " " + sc.nextLine());
        }


    }
}
