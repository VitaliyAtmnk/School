package gui;

import javax.swing.*;
import java.awt.*;

public class Flow extends Nezapomen {
    Flow() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150, 150));
        panel.setBackground(Color.BLACK);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        this.setLayout(new FlowLayout());
        //přidá 10 tlačítek do panelu
        for (int i = 0; i < 10; i++) {
            panel.add(new JButton(String.valueOf(i + 1)));
        }

        add(panel);
    }

    public static void main(String[] args) {
        Flow flow = new Flow();
        flow.setVisible(true);
    }

}
