package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animations extends Nezapomen {

    AnimatedPanel panel;

    Animations() {
        panel = new AnimatedPanel();

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Animations animations = new Animations();
        animations.setVisible(true);
    }
}

class AnimatedPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 800;
    final int PANEL_HEIGHT = 800;

    Image floater;
    Image background;
    Timer t;
    int xVelocity = 30;
    int yVelocity = 20;
    int x = 0;
    int y = 0;

    AnimatedPanel() {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setBackground(Color.black);
        t = new Timer(10, this);
        t.start();

        floater = new ImageIcon("ard.png").getImage();
        background = new ImageIcon("thumbnail_Image.jpg").getImage();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //atd

        Graphics2D gg = (Graphics2D) g;

        gg.drawImage(background, 0, 0, null);
        gg.drawImage(floater,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH-floater.getWidth(null) || x < 0) xVelocity *= -1;
        if(y >= PANEL_HEIGHT-(floater.getHeight(null)) || y < 0) yVelocity *= -1;
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
    }
}
