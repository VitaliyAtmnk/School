package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class AnotherOne {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        CanvasTwo can = new CanvasTwo();
        can.setPreferredSize(new Dimension(640, 480));
        frame.add(can);

        frame.setTitle("Title");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class CanvasTwo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5));

        drawArrow(g2, 20, 20, getWidth()-20, getHeight()-20, 30);
    }

    public void drawArrow(Graphics2D g, int x1, int y1, int x2, int y2, double arrowLength) {
        double vx = x2 - x1;
        double vy = y2 - y1;

        double vLength = Math.sqrt(vx * vx + vy * vy); // alternative => Math.hypot(vx, vy);
        double vNormX = vx / vLength;
        double vNormY = vy / vLength;

        double vArrowX = vNormX * arrowLength;
        double vArrowY = vNormY * arrowLength;

        double kx = -vArrowX;
        double ky = vArrowY;

        kx *= 0.25;
        ky *= 0.25;

        g.draw(new Line2D.Double(x1, y1, x2, y2));

        g.draw(new Line2D.Double(x2,y2,x2-vArrowX + kx, y2-vArrowY + ky));
        g.draw(new Line2D.Double(x2,y2,x2-vArrowX - kx, y2-vArrowY - ky));
    }
}