package edu.sehir.oop;

/**
 * Created by ensar on 14.11.2016.
 */
//swing classes
import javax.swing.*;
import javax.swing.event.*;

//this is a simple adapter class to
//convert List awt methods to Swing methods

public class JawtList extends JScrollPane
        implements ListSelectionListener, awtList {
    private JList listWindow;
    private JListData listContents;

    public JawtList(int rows) {
        listContents = new JListData();
        listWindow = new JList(listContents);
        listWindow.setPrototypeCellValue("Abcdefg Hijkmnop");
        getViewport().add(listWindow);
    }
    //-----------------------------------------
    public void add(String s) {
        listContents.addElement(s);
    }
    //-----------------------------------------
    public void remove(String s) {
        listContents.removeElement(s);
    }
    //-----------------------------------------
    public String[] getSelectedItems() {
        Object[] obj = listWindow.getSelectedValues();
        String[] s = new String[obj.length];
        for (int i =0; i < obj.length; i++)
            s[i] = obj[i].toString();
        return s;
    }
    //-----------------------------------------
    public void valueChanged(ListSelectionEvent e) {
    }
}
