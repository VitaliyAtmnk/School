package asiSeNecoRozbije;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataTable extends Nezapomen {

    DefaultTableModel model;
    ArrayList<Record> data;

    public DataTable() {
        data = new ArrayList<>();
        setLayout(new BorderLayout());
        SortMenu sortMenu = new SortMenu();
        add(sortMenu, BorderLayout.NORTH);



        String[] column = {"Name", "Release year", "Rating", "Duration"};
        model = new DefaultTableModel(column, 0);
        JTable table = new JTable(model);
        table.setEnabled(false);
        JScrollPane sp = new JScrollPane(table);

        sortMenu.outputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sortMenu.name.isSelected()){
                    clearTable();
                    data.sort(Record.BY_NAME);
                    fillTable();
                }
                if(sortMenu.duration.isSelected()){
                    clearTable();
                    data.sort(Record.BY_DURATION);
                    fillTable();
                }
                if(sortMenu.rating.isSelected()){
                    clearTable();
                    data.sort(Record.BY_RATING);
                    fillTable();
                }
                if(sortMenu.release.isSelected()){
                    clearTable();
                    data.sort(Record.BY_YEAR);
                    fillTable();
                }
            }
        });

        add(sp, BorderLayout.CENTER);
        setSize(500, 500);
        setResizable(false);

    }

    void clearTable() {
        model.setRowCount(0);
    }

    void loadData(String path) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                String[] lineData = line.split(";");
                Record toAdd = new Record(lineData[0],
                        Integer.parseInt(lineData[1]),
                        Integer.parseInt(lineData[3]),
                        Double.parseDouble(lineData[2]));
                data.add(toAdd);
            }

        } catch (IOException io) {
            System.out.println("NOt like this");
        }
    }

    void fillTable() {
        for (Record line : data) {
            String[] input = line.returnAsTableRow();
            model.addRow(input);
        }
    }

    public static void main(String[] args) {
        DataTable dataTable = new DataTable();
        dataTable.setVisible(true);
        dataTable.loadData("Tracks.txt");
        System.out.println(dataTable.data.get(0));
        dataTable.fillTable();


    }
}
