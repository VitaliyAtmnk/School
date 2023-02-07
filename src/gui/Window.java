package gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    Dimension d = new Dimension(480, 480);

    Window() {
        this.setTitle("Name");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(d);
        this.setResizable(false);

        //sets icon
        ImageIcon icon = new ImageIcon("icona.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }


    public static void main(String[] args) {
        Window myWindow = new LabelExample();
        myWindow.setVisible(true);
    }
}
