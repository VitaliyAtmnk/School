package gui;

import javax.swing.*;
import java.awt.*;

public class Panel extends Nezapomen {
    Panel(String title) {
        setTitle(title);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(250, 0, 250, 250);


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 250, 500, 250);

        this.setSize(bluePanel.getWidth(), bluePanel.getHeight() + greenPanel.getHeight());
        this.add(redPanel);
        this.add(greenPanel);
        this.add(bluePanel);
        this.setLayout(null);
        this.setResizable(false);

    }

    public static void main(String[] args) {
        Panel panel = new Panel("Panel");
        panel.setVisible(true);
    }
}
