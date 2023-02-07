package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Border extends Nezapomen {
    JButton jb;

    Border(String title) {
        setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        jb = new JButton();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        jb.setPreferredSize(new Dimension(100, 100));

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.EAST);
        add(panel3, BorderLayout.SOUTH);
        add(panel4, BorderLayout.WEST);
        add(jb, BorderLayout.CENTER);

        setTitle(title);
        setSize(500, 500);

        JPanel[] jPanels = {panel1, panel2, panel3, panel4};
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    jb.setBackground(panel4.getBackground());
                    panel4.setBackground(panel3.getBackground());
                    panel3.setBackground(panel2.getBackground());
                    panel2.setBackground(panel1.getBackground());
                    panel1.setBackground(jb.getBackground());

            }
        });
    }


    public static void main(String[] args) {
        Border br = new Border("Border");
        br.setVisible(true);
    }
}
