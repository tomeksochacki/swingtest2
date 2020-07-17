package testswingnextstudypackage;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){

        int widthS = Toolkit.getDefaultToolkit().getScreenSize().width;
        int heightS = Toolkit.getDefaultToolkit().getScreenSize().height;

        //System.out.println(widthS);
        this.setSize((widthS/2),(heightS/2));
        //this.setLocation(widthS/4, heightS/4);
        int widthFrame = this.getSize().width;
        int heightFrame = this.getSize().height;

        this.setLocation((widthS-widthFrame)/2, (heightS-heightFrame)/2);
        this.setDefaultCloseOperation(3);
        this.setTitle("My frame");
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
