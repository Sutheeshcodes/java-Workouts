import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class component  extends JComponent{
    public static void main(String[] args) {
        mycomponent comp = new mycomponent();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("my component");
        
        frame.add(comp);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class mycomponent extends JComponent{
    public void paint(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(30, 30,100,100);
    }
}
