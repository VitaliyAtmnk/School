package gui;

import javax.swing.*;
import java.awt.*;

public class OwnComponent extends JPanel {
    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public OwnComponent() {
        this.setPreferredSize(new Dimension(640,480));
        this.setLayout(new GridLayout(10,10));
        this.add(new JLabel("sloupec 1"));
        this.add(new JLabel("sloupec 2"));
        for (int i = 0; i < 18; i++) {
            this.add(new JLabel("data"));
        }
    }

    public static void main(String[] args) {
        Nezapomen n = new Nezapomen();
        n.add(new OwnComponent());
        n.setVisible(true);
    }
}
