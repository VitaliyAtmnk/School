package gui.setup;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ItemPanel extends JPanel {

    ArrayList<ListItem> items;
    final int ROWS = 2, COLS = 6;

    ItemPanel(ArrayList<ListItem> items) {
        this.items = items;
        setLayout(new GridLayout(ROWS, COLS));

        for (ListItem item : items) add(item);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        ArrayList<ListItem> items = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            items.add(new ListItem("Tmp", i, Color.green));
        }

        frame.add(new ItemPanel(items));
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
