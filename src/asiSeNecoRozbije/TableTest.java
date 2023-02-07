package asiSeNecoRozbije;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableTest extends Nezapomen {

    public TableTest() {
        String[] columns = {"SLoupec 1", "SLoupec 2", "SLoupec 3", "SLoupec 4"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable tj = new JTable(model);
        JScrollPane cp = new JScrollPane(tj);

        model.addRow(new String[]{"a", "a", "a", "a"});

        add(cp);

    }

    public static void main(String[] args) {
        TableTest table = new TableTest();
        table.setVisible(true);
    }
}
