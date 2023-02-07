package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse extends Nezapomen implements MouseListener {

    JLabel label;
    int score;
    public Mouse() {
        setLayout(null);
        label = new JLabel();

        label.setBounds(0,0,420,420);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.addMouseListener(this);
        score = 0;

        add(label);
    }

    public static void main(String[] args) {
        Mouse m = new Mouse();
        m.setVisible(true);
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
//        score++;
//        System.out.println(score);
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {
        label.setBackground(Color.yellow);
    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.green);
    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        label.setBackground(Color.magenta);
    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.DARK_GRAY);

    }
}
