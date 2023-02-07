package asiSeNecoRozbije;

import javax.swing.*;
import java.awt.*;

public class SortMenu extends JPanel {

    public JButton outputButton;
    JRadioButton name, release, rating, duration;

    public SortMenu() {
        setLayout(new FlowLayout());
        name = new JRadioButton("name");
        release = new JRadioButton("release");
        rating = new JRadioButton("rating");
        duration = new JRadioButton("duration");

        ButtonGroup group = new ButtonGroup();
        group.add(name);
        group.add(release);
        group.add(rating);
        group.add(duration);

        JLabel label = new JLabel("Sort by: ");
        outputButton = new JButton("Sort!");

        this.add(name);
        this.add(rating);
        this.add(release);
        this.add(duration);
        this.add(label);
        this.add(outputButton);

    }

}
