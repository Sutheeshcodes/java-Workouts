import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class colorex  implements ActionListener {

    JFrame frame ;
    Container con;
    JButton button;
    JTextArea area;

    colorex(){
      
        frame = new JFrame();
        con = new Container();
        con.setLayout(new FlowLayout());

        button = new JButton("color");
        button.addActionListener(this);

        area = new JTextArea("hello this is a sample text");
        area.setBounds(30,30,100,100);
 
        con.add(button);
        con.setSize(600,600);
        con.setVisible(true);
      
        frame.add(area);
        frame.add(con);
        frame.setSize(400,400);       
        frame.setVisible(true);
        
    }



    public static void main(String[] args) {
        new colorex();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
      Color initiator= Color.red;

        Color color = JColorChooser.showDialog(con, "set colour", initiator);
        area.setBackground(color);
        
    }
}
