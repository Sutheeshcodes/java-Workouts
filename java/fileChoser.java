import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fileChoser implements ActionListener{
    static JLabel label;


fileChoser(){

}


    public static void main(String[] args) {
        
        JFrame frame = new JFrame("file chooser");
        frame.setSize(400,400);

        JButton b1 = new JButton("save");
        JButton b2 = new JButton("open");

        fileChoser obj = new fileChoser();
        b1.addActionListener(obj);
        b2.addActionListener(obj);

        JPanel panel = new JPanel();

        panel.add(b1);
        panel.add(b2);

        label = new  JLabel("no files selected ");
 
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);

 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       
        String action = e.getActionCommand();
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView());
        if(action.equals("save")){

            int show = chooser.showSaveDialog(null);

            if(show==JFileChooser.APPROVE_OPTION){
                label.setText(chooser.getSelectedFile().getAbsolutePath());
            }else{
                label.setText("operation failed ");
            }
        }else{
            int show = chooser.showOpenDialog(null);
            if(show==JFileChooser.APPROVE_OPTION){
                label.setText(chooser.getSelectedFile().getAbsolutePath());
            }else{
                label.setText("operation failed ");
            }
        }
    }



    



   
}
