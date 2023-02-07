package gui;

import javax.swing.*;
import java.awt.*;

public class BorderAdvanced extends Nezapomen{
    BorderAdvanced(String title){
        setLayout(new BorderLayout(10,10));

        JButton jb = new JButton();

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.magenta);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        //SUB:

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.DARK_GRAY);
        panel8.setBackground(Color.GRAY);
        panel9.setBackground(Color.LIGHT_GRAY);
        panel10.setBackground(Color.white);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.setLayout(new BorderLayout());
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.EAST);
        panel5.add(panel8, BorderLayout.SOUTH);
        panel5.add(panel9, BorderLayout.WEST);
        panel5.add(jb, BorderLayout.CENTER);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.EAST);
        add(panel3, BorderLayout.SOUTH);
        add(panel4, BorderLayout.WEST);
        add(panel5, BorderLayout.CENTER);

        JPanel []panels = {panel1, panel2, panel3, panel4, panel6, panel7, panel8, panel9, panel10};
        int length = panels.length-1;

        jb.addActionListener(e -> {
            for(int i = length; i >= 0; i--){
                Color c = panels[length].getBackground();
                if(i==0) {
                    panels[0].setBackground(c);
                }
                else panels[i].setBackground(panels[i-1].getBackground());
            }
        });

        setTitle(title);
        setSize(500,500);

    }

    public static void main(String[] args) {
        BorderAdvanced br = new BorderAdvanced("Border");
        br.setVisible(true);
    }
}