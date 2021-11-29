package tr.edu.sehir;

import java.awt.*;
import javax.swing.*;

class HelloWdDisplay extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString( "Hello World!", 20, 30 );
        }
    }



