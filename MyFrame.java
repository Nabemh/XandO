import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("First trial");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420); //x and Y dimentions
        this.setVisible(true); //makes frame visible

        this.getContentPane().setBackground(Color.BLACK);
    }

}
