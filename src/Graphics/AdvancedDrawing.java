package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class AdvancedDrawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Canvas can = new Canvas();
        can.setPreferredSize(new Dimension(640, 480));
        frame.add(can);

        frame.setTitle("Title");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Canvas extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());

        g2.setColor(Color.BLACK);
        double x1 = 200, x2 = 500, y1 = 25, y2 = 32.5;
        Line2D line = new Line2D.Double(x1, y1, x2, y2);
        g2.draw(line);

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        double yOffset = 30;
        g2.draw(new Line2D.Double(x1, y1 + yOffset, x2, y2 + yOffset));
        g2.setStroke(new BasicStroke(10));

        yOffset += 30;
        g2.draw(new Line2D.Double(x1, y1 + yOffset, x2, y2 + yOffset));

        g2.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, new float[]{10.0f, 20.0f}, 0));

        yOffset += 30;
        g2.draw(new Line2D.Double(x1, y1 + yOffset, x2, y2 + yOffset));
    }
}
