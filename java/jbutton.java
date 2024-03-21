
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


class jbutton  extends WindowAdapter implements  ActionListener{
    JFrame frame;
    JButton b;
    JRadioButton radio1,radio2;

    public jbutton(){

       frame =  new JFrame("Check box");
		frame.addWindowListener(this);
        

        radio1 = new JRadioButton("male");
        radio2= new JRadioButton("female");
        b= new JButton("click me !!");

        radio1.setBounds(75,50,100,30);
        radio2.setBounds(75,100,100,30);
        
        b.setBounds(100,150,120,30);
        b.addActionListener(this);

        ButtonGroup bg = new ButtonGroup();
        bg.add(radio1);
        bg.add(radio2);

        frame.add(radio1);
        frame.add(radio2);
        frame.add(b);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
        
    } 
    @Override
    public void actionPerformed(ActionEvent e) { 
        if(radio1.isSelected()){
            JOptionPane.showMessageDialog(b, "you are male");
        }
        if(radio2.isSelected()){
            JOptionPane.showMessageDialog(b,"ewrfgwerfgwr3etf");
        }
    }

    public static void main(String[] args){
        new jbutton();
        System.out.println("running  ");
   }
    public void windowClosing(WindowEvent event){
        int  a = JOptionPane.showConfirmDialog(frame,"are you sure aanoo?");

        if(a==JOptionPane.YES_OPTION){
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    } 

}