package gui;

import javax.swing.*;
import java.awt.*;

public class Buttons extends Nezapomen{
    JButton button;
    int score = 0;
    int interval;
    Buttons(String title){
        super();

        button = new JButton();
        button.setText("Start");
        button.setBounds(100,100,100,50);

        button.setFont(new Font("Monocraft", Font.PLAIN, 20));
        button.setFocusable(false);
        button.setForeground(Color.black);
        button.setBackground(Color.LIGHT_GRAY);

        button.addActionListener(e -> {
            if(e.getSource() == button) {
                button.setText("" + score);
                System.out.println(interval+" s");
            }
        });

        setTitle(title);
        setLayout(null);
        this.add(button);
        this.setSize(500,500);

    }

    public static void main(String[] args) {
        Buttons btn = new Buttons("button");
        btn.setVisible(true);
    }
}
