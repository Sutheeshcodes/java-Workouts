import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menuexample {


JMenu menu1,menu2,menu3;
JMenuItem i1,i2,i3,i4,i5,i6,i7;



    public menuexample() {

         JFrame frame= new JFrame();

        JMenuBar bar= new JMenuBar();

        menu1 = new JMenu("File");
        menu2=new JMenu("Edit");
        menu3= new JMenu("Help");


       

        i1= new JMenuItem("new File");
        i2= new JMenuItem("Open File");
        i3= new JMenuItem("cut");
        i4= new JMenuItem("copy");
        i5= new JMenuItem("paste");
        i6= new JMenuItem("select All");
        i7= new JMenuItem("help?");
        
        menu1.add(i1);
        menu1.add(i2);
        menu2.add(i3);
        menu2.add(i4);
        menu2.add(i5);
        menu2.add(i6);
        menu3.add(i7);

        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu3);

        frame.setJMenuBar(bar);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);


}




    public static void main(String[] args) {
        new menuexample();
    }
}
