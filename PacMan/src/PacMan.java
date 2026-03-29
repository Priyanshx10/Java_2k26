import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel{
        private int rowcount = 21;
        private int columncount = 19;
        private int tileSize = 32;
        private int boardWidth = columncount * tileSize;
        private int boardHeight = rowcount * tileSize;

        PacMan(){
            setPreferredSize(new Dimension(boardWidth, boardHeight));
            setBackground(Color.BLACK);
        }
}
