package maze;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Game extends JFrame {
    JButton Up, Down, Left, Right;
    JLabel helper;

    Game() {
        setLayout(new BorderLayout());
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Up = new JButton("^");
        Down = new JButton("v");
        Left = new JButton("<");
        Right = new JButton(">");

        Up.setFocusable(false);
        Down.setFocusable(false);
        Left.setFocusable(false);
        Right.setFocusable(false);

        Up.setFont(new Font("Monocraft", Font.PLAIN, 20));
        Down.setFont(new Font("Monocraft", Font.PLAIN, 20));
        Left.setFont(new Font("Monocraft", Font.PLAIN, 20));
        Right.setFont(new Font("Monocraft", Font.PLAIN, 20));

        helper = new JLabel("TMP");

        helper.setFont(new Font("Monocraft", Font.PLAIN, 20));
        helper.setHorizontalAlignment(SwingConstants.CENTER);

        add(Up, BorderLayout.NORTH);
        add(Down, BorderLayout.SOUTH);
        add(Left, BorderLayout.WEST);
        add(Right, BorderLayout.EAST);
        add(helper, BorderLayout.CENTER);
    }

    ArrayList<Tile> initMaze(){
        ArrayList<Tile> maze = new ArrayList<>();

        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));
        maze.add(new Tile(new Tile[]{null,null,null,null}, false, false));

        maze.get(0).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(1).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(2).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(3).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(4).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(5).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(6).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(7).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(8).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(9).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(10).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(11).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(12).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(13).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(14).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(15).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(16).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(17).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(18).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(19).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(20).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(21).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(22).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(23).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(24).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(25).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(26).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(27).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(28).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(29).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(30).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(31).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(32).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(33).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(34).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(35).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(36).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(37).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(38).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(39).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(40).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(41).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(42).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(43).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(44).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(45).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(46).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(47).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(48).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(49).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(50).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(51).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(52).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(53).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(54).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(55).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(56).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(57).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(58).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(59).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(60).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(61).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(62).possibleDirections = new Tile[]{null, null, null, null};
        maze.get(63).possibleDirections = new Tile[]{null, null, null, null};



        return maze;
    }

    public static void main(String[] args) {
        Game g = new Game();
        g.setVisible(true);

        for (int i = 1; i < 65; i++) {
            System.out.println(i);
        }
    }
}