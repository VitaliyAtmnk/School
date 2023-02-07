package gui;

import javax.swing.*;
import java.awt.*;

public class GridBasic extends Nezapomen {
    GridBasic() {
        int size = 12;
        this.setLayout(new GridLayout(size, size));
        JLabel label;
        int n = 0;
        Color a = Color.BLACK;
        Color b = Color.WHITE;
        for (int i = 0; i < size*size; i++) {
            label = new JLabel(" ");
            if (size % 2 == 0 && i % size == 0) {
                Color temp = a;
                a = b;
                b = temp;
            }
            label.setBackground(i % 2 == 0 ? a : b);
            label.setOpaque(true);
            //label.setBorder(BorderFactory.createLineBorder(Color.green, 2));
            add(label);
        }

    }

    public static void main(String[] args) {
        GridBasic gb = new GridBasic();
        gb.setVisible(true);
    }
}
