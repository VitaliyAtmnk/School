package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelExample extends Window{
    public LabelExample() {
        super();
        //creates label and adds it to a window
        JLabel label = new JLabel();
        label.setText("Ahoj mateji");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        label.setBackground(Color.BLACK);
        label.setForeground(Color.red);
        label.setOpaque(true);

        //sets font to "Monocraft"
        label.setFont(new Font("Monocraft", Font.PLAIN, 40));

        Border border = BorderFactory.createLineBorder(Color.RED, 3);
        label.setBorder(border);

        label.setBounds(0,0,300,300);

        this.add(label);
        this.setLayout(null);
        this.setResizable(true);
    }
}
