package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Texts extends Nezapomen {
    public Texts() {
        this.setLayout(new FlowLayout());

        JTextField textField = new JTextField("zadej cestu");
        textField.setPreferredSize(new Dimension(250, 40));
        JButton jb = new JButton("Submit");
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0xA937A31D, true));
        textField.setBackground(Color.BLACK);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jb) {
                    try {
                        vypisObsah(textField.getText());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        this.add(jb);
        this.add(textField);
        this.pack();
    }

    public void vypisObsah(String path) throws IOException {
        ArrayList<String> arr = new ArrayList<>(Files.readAllLines(Path.of(path)));
        for (String line : arr) {
            System.out.println(line);
        }

    }

    public static void main(String[] args) {
        Texts t = new Texts();
        t.setVisible(true);
    }
}
