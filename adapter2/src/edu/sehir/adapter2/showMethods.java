package edu.sehir.adapter2;

/**
 * Created by ensar on 14.11.2016.
 */
import java.lang.reflect.*;
import javax.swing.*;
// a simple example program to
//list all the methods of the JList class
//not part of the JTwoLists project
public class showMethods {
    public showMethods()
    {
        JList list = new JList();
        Method[] methods = list.getClass().getMethods();
        for (int i = 0; i < methods.length; i++)
        {
            System.out.println(methods[i].getName());
            Class cl[] = methods[i].getParameterTypes();
            for(int j=0; j < cl.length; j++)
                System.out.println(cl[j].toString());
        }
    }
    static public void main(String argv[])
    {
        new showMethods();
    }
}
