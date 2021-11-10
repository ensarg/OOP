package edu.sehir.oop;
import java.awt.*;

//swing classes
import javax.swing.*;

/**
 * Created by ensar on 22.11.2016.
 */
public class BorderDecorator extends Decorator {
    int x1, y1, w1, h1;

    public BorderDecorator(JComponent c)
    {
        super(c);
    }
    public void setBounds(int x, int y, int w, int h)
    {
        x1 = x; y1= y;
        w1 = w; h1 = h;
        super.setBounds(x, y, w, h);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.drawLine(0, 0, w1, h1);
    }
}
