import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class menu implements ActionListener   {

JMenu file , edit,help;
JTextArea area;
JMenuItem cut,copy,paste,selectall;

    public menu() {
        JFrame frame= new JFrame("Menu and item example");

        JMenuBar bar= new JMenuBar();

        file=new JMenu("file");
        edit =  new JMenu("Edit");
        help=new JMenu("help");

        cut= new JMenuItem("cut");
        copy= new JMenuItem("copy");
        paste= new JMenuItem("paste");
        selectall= new JMenuItem("selectAll");

        
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectall.addActionListener(this);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);
    
        bar.add(file);
        bar.add(edit);
        bar.add(help);

        area = new JTextArea( "hello world ");

        area.setBounds(5,5,360,320);

        frame.setJMenuBar(bar);
        frame.add(area);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
}

    public static void main(String[] args)   {   
        // jmenu - display menu bar on windows or frame 
        new menu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==cut){
            area.cut();
        }if(e.getSource()==paste){
            area.paste();
        }if(e.getSource()==copy){
            area.copy();
        }if(e.getSource()==selectall){
            area.selectAll();
        }
    }
}
