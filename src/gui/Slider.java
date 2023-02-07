package gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider extends Nezapomen {
    public Slider() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JSlider slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);

        slider.setFont(new Font("Monocraft", Font.PLAIN, 20));
        slider.setOrientation(SwingConstants.VERTICAL);
        label.setText("C = " + slider.getValue());

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("C = " + slider.getValue());
            }
        });

        panel.add(slider);
        panel.add(label);
        this.add(panel);
    }

    public static void main(String[] args) {
        Slider s = new Slider();
        s.setVisible(true);
    }
}
