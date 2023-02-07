package gui;

import javax.swing.*;
import java.awt.*;

public class Progress extends Nezapomen {

    JProgressBar bar;

    public Progress() {
        bar = new JProgressBar();

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);

        bar.setStringPainted(true);
        bar.setFont(new Font("Monocraft", Font.PLAIN, 20));
        bar.setBackground(Color.black);
        bar.setForeground(Color.red);

        this.add(bar);
        this.setLayout(null);
        this.setSize(420, 420);
    }


    void fill() {
        int counter = 0;

        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter += 1;
        }
    }


    public static void main(String[] args) {
        Progress prg = new Progress();
        prg.setVisible(true);
        prg.fill();
    }
}
