import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class demo extends WindowAdapter {

     JFrame f;

    
    public demo() {
        f= new JFrame("demo");
        f.addWindowListener(this);

        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       
        f.setLayout(null);
        f.setVisible(true);
    }


    public void windowClosing(WindowEvent e){
        int a = JOptionPane.showConfirmDialog(f,  "are you sure aano ?");

        if (a==JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args) {
         
        new demo();
    }
}
