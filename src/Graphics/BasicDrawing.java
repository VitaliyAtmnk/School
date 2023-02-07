package Graphics;

import javax.swing.*;
import java.awt.*;

public class BasicDrawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Title");
        frame.setSize(320, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        DrawingPanel dp = new DrawingPanel();
        dp.setPreferredSize(new Dimension(640, 480));
        frame.add(dp);
        frame.pack(); // => všechny prvky budou mít prefered size

        frame.setVisible(true);
    }
}

class DrawingPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        //g.drawLine(0,0,getWidth(),getHeight());


        //symbol
        g.drawLine(getWidth() / 2, getHeight() / 3, getWidth() / 2, getHeight() - (getHeight() / 3)); // vertical line
        g.drawLine(getWidth() / 3, getHeight() / 2, getWidth() - (getWidth() / 3), getHeight() / 2); // horizontal line

        g.drawLine(getWidth() - (getWidth() / 3), getHeight() / 3, getWidth() / 2, getHeight() / 3); // top left
        g.drawLine(getWidth() - (getWidth() / 3), getHeight() - (getHeight() / 3), getWidth() - (getWidth() / 3), getHeight() / 2); // top right
        g.drawLine(getWidth()/2,getHeight()-(getHeight()/3),getWidth() / 3,getHeight()-(getHeight()/3)); // bottom right
        g.drawLine(getWidth()/3, getHeight()/2, getWidth()/3, getHeight() / 3); //bottom left

//
//        int[] xCoords = {150, 165, 180};
//        int[] yCoords = {30, 0, 30};
//
////        g.drawPolygon(xCoords, yCoords, 3);
////        g.drawString("symboly", 0, 0);
////        g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
//
//        int circleX = 150;
//        int circleY = 80;
//        int circleRadius = 5;
////        g.fillOval(circleX-circleRadius, circleY - circleRadius, circleRadius, circleRadius);
//
//        String text = "Centered text";
//        FontMetrics m = g.getFontMetrics();
//
//        int textHeight = m.getHeight();
//        int textWidth = m.stringWidth(text);
//
//        g.drawString(text, circleX - textWidth / 2, circleY + textHeight);
    }
}