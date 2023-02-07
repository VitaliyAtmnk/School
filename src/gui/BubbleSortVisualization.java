package gui;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BubbleSortVisualization extends JFrame implements ActionListener {
    int[] array;
    JButton sortButton;
    JLabel[] labels;

    BubbleSortVisualization(int[] array) {
        this.array = array;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, array.length));
        labels = new JLabel[array.length];
        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel();
            this.add(labels[i]);
        }
        formatLabels();
        visualizeArray();
        sortButton = new JButton("Sort Array");
        sortButton.addActionListener(this);
        this.add(sortButton);
        this.pack();
    }

    void visualizeArray() {
        for (int i = 0; i < array.length; i++) {
            labels[i].setText(String.valueOf(array[i]));
            labels[i].paintImmediately(0, 0, getWidth(), getHeight());
        }
    }

    void highlight(Color color, int index) {
        labels[index].setBackground(color);
        labels[index].paintImmediately(0, 0, getWidth(), getHeight());

    }

    void formatLabels() {
        Border border = BorderFactory.createLineBorder(Color.black, 2);
        for (JLabel label : labels) {
            label.setFont(new Font("MV Boli", Font.PLAIN, 42));
            label.setBorder(border);
            label.setOpaque(true);// bude se hodit :)
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.CENTER);
        }
    }

    void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Thread died :( yikes");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sortButton) {
            sortButton.setText("Sorting...");
            sortButton.setEnabled(false);
            sortButton.paintImmediately(0, 0, getWidth(), getHeight());
//            do some magic
            bubbleSort(array);
            //selectionSort(array);
            sortButton.setText("Sorted!");
        }
    }

    void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
                whereAmI(j - 1, j);
            }
        }
    }

    void selectionSort(int[] arr) {
        int n = arr.length;
        //selection sort
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                }

            }

            swap(arr, i, min_idx);
        }

    }

    void whereAmI(int i, int j) {
        highlight(Color.green, i);
        highlight(Color.blue, j);
        pause();
        highlight(Color.white, i);
        highlight(Color.white, j);
        visualizeArray();
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        highlight(Color.blue, i);
        arr[j] = temp;
        highlight(Color.green, j);
        pause();
        visualizeArray();
    }

    public static void main(String[] args) {
        int[] array = {8, 6, 4, 2, 9, 11, 5, 10, 42, 7};
        BubbleSortVisualization visualization = new BubbleSortVisualization(array);
        visualization.setVisible(true);
    }

}
