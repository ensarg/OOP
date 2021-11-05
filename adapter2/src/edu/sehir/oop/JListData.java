package edu.sehir.oop;

/**
 * Created by ensar on 14.11.2016.
 */
import java.util.*;
//swing classes
import javax.swing.*;

public class JListData extends AbstractListModel {
    private Vector data;

    public JListData() {
        data = new Vector();
    }
    //-----------------------------------------
    public int getSize() {
        return data.size();
    }
    //-----------------------------------------
    public Object getElementAt(int index) {
        return data.elementAt(index);
    }
    //-----------------------------------------
    public void addElement(String s) {
        data.addElement(s);
        fireIntervalAdded(this, data.size()-1, data.size());
    }
    //-----------------------------------------
    public void removeElement(String s) {
        data.removeElement(s);
        fireIntervalRemoved(this, 0, data.size());
    }
}
