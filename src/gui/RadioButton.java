package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton extends Nezapomen{
    public RadioButton() {
        setLayout(new FlowLayout());

        JRadioButton assemblyRB = new JRadioButton("assembly");
        JRadioButton javaRB = new JRadioButton("java");
        JRadioButton pythonRB = new JRadioButton("python");
        JRadioButton cSharpRB = new JRadioButton("c#");

        ButtonGroup languages = new ButtonGroup();
        languages.add(assemblyRB);
        languages.add(javaRB);
        languages.add(pythonRB);
        languages.add(cSharpRB);

        JButton jb = new JButton();
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(javaRB.isSelected()){
                    System.out.println("java");
                }
                if(assemblyRB.isSelected()){
                    System.out.println("assembly");
                }
                if(cSharpRB.isSelected()){
                    System.out.println("c#");
                }
                if(pythonRB.isSelected()){
                    System.out.println("python");
                }

            }
        });

        this.add(assemblyRB);
        this.add(javaRB);
        this.add(pythonRB);
        this.add(cSharpRB);
        this.pack();
    }

    public static void main(String[] args) {
    RadioButton rb = new RadioButton();
    rb.setVisible(true);
    }
}
