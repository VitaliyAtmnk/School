package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowOpen extends Nezapomen{
    public WindowOpen() {
        this.setTitle("new :u");
        JButton jb = new JButton("nove okénko");

        jb.setBounds(100,100,100,100);
        jb.addActionListener(e -> {
            if(e.getSource() == jb) {
                InsertMP nw = new InsertMP();
                nw.setVisible(true);
            }
        });
        this.setLayout(null);
        this.add(jb);
    }

    public static void main(String[] args) {
        WindowOpen wo = new WindowOpen();
        wo.setVisible(true);
    }
}
class NewWindow extends Nezapomen{
    public NewWindow() {
        this.setTitle("nové okénko");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
class InsertMP extends MatrixPaint{
    public InsertMP() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
