package edu.sehir.oop;

import java.awt.event.ActionListener;
import javax.swing.text.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


/**
 * Created by ensar on 07.12.2016.
 */
public class borderWindow extends JxFrame implements ActionListener{
    JButton Quit, Cbutton, Dbutton;
    public borderWindow()
    {
        super ("Deco Button");
        JPanel jp = new JPanel();

        getContentPane().add(jp);
        jp.add( Cbutton = new JButton("Cbutton"));
        jp.add( Dbutton = new JButton("Dbutton"));
        EmptyBorder ep = new EmptyBorder(4,4,4,4);
        LineBorder lb = new LineBorder(Color.black, 2);
        Dbutton.setBorder(new CompoundBorder(lb, ep));
        jp.add(Quit = new JButton("Quit"));
        EtchedBorder eb = new EtchedBorder();
        Quit.addActionListener(this);
        Quit.setBorder(eb);
        setSize(new Dimension(200,100));

        setVisible(true);
        Quit.requestFocus();
    }
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}
