package gui.setup;

import javax.swing.*;
import java.awt.*;

public class ListItem extends JPanel {

    JLabel itemLabel, quantityLabel;

    ListItem(String item, int quantity, Color color) {
        setLayout(new GridLayout(2, 1));

        itemLabel = new JLabel(item);
        quantityLabel = new JLabel(String.format("%dX", quantity));

        itemLabel.setHorizontalAlignment(SwingConstants.CENTER);
        quantityLabel.setHorizontalAlignment(SwingConstants.CENTER);

        itemLabel.setFont(new Font("Monocraft", Font.PLAIN, 20));
        quantityLabel.setFont(new Font("Monocraft", Font.PLAIN, 20));

        itemLabel.setBackground(color);
        quantityLabel.setBackground(color);

        itemLabel.setOpaque(true);
        quantityLabel.setOpaque(true);

        setBorder(BorderFactory.createLineBorder(Color.black));

        add(itemLabel);
        add(quantityLabel);

    }

    void setQuantity(int num) {
        quantityLabel.setText(String.format("%dX", num));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new ListItem("Whirpool", 4, Color.cyan));
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
