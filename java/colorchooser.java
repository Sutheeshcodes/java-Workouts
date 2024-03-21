import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class colorchooser implements ActionListener {
    JButton b ;
    Container con;
    JFrame frame;


    public colorchooser() {
        con = new Container();

        con.setLayout(new FlowLayout());

        b = new JButton("color");
        b.addActionListener(this);

        con.add(b);
        con.setSize(400,400);
        con.setVisible(true);

        frame = new JFrame();
        frame.add(con);
        frame.setSize(400,400);
        frame.setVisible(true);
        
    
    }

  

    

    public static void main(String[] args) {
        new colorchooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Color initiator= Color.red;

        Color color = JColorChooser.showDialog(con, "set colour", initiator);
        con.setBackground(color);
    }
}
 