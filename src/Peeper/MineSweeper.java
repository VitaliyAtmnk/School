package Peeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class MineSweeper extends JFrame {
    JLabel scoreLabel;
    int score = 0;

    MineSweeper() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLayout(new BorderLayout());

        scoreLabel = new JLabel("Score");
        scoreLabel.setFont(new Font("Monocraft", Font.PLAIN, 30));
        scoreLabel.setBorder(BorderFactory.createLineBorder(Color.black, 3));

        //center that shit
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        MineField panel = new MineField();
        panel.setBackground(Color.BLACK);

        add(scoreLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        for (int i = 0; i < panel.labels.size(); i++) {
            int finalI = i;
            panel.labels.get(i).addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    if (!panel.labels.get(finalI).clicked) panel.labels.get(finalI).setBackground(Color.cyan);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    panel.labels.get(finalI).clicked = true;
                    if (panel.labels.get(finalI).surprise) {
                        panel.labels.get(finalI).setBackground(Color.red);
                        scoreLabel.setText(":C");
                    } else {
                        panel.labels.get(finalI).setBackground(Color.green);
                        score += 100;
                        scoreLabel.setText("" + score);
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if (!panel.labels.get(finalI).clicked) panel.labels.get(finalI).setBackground(Color.yellow);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (!panel.labels.get(finalI).clicked) panel.labels.get(finalI).setBackground(Color.white);
                }
            });
        }
    }

    public static void main(String[] args) {
        MineSweeper ms = new MineSweeper();
        ms.setVisible(true);
    }
}

class MineField extends JPanel {

    final int DIM = 5;

    ArrayList<SingleField> labels = new ArrayList<>();

    MineField() {
        setLayout(new GridLayout(DIM, DIM));
        SingleField gridLab;
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                gridLab = new SingleField(" ");


                add(gridLab);
                labels.add(gridLab);
            }
        }
        labels.get(randomNum()).surprise = true;
    }

    int randomNum() {
        Random r = new Random();
        return (r.nextInt(0, labels.size()));
    }
}

class SingleField extends JLabel {
    boolean clicked = false, surprise = false;

    public SingleField(String text) {
        this.setText(text);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Monocraft", Font.PLAIN, 30));
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }
}