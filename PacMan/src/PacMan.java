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

        private Image wallImage;
        private Image blueghostImage;
        private Image pinkghostImage;
        private Image orangeghostImage;
        private Image redghostImage;
        
        private Image pacmanUpImage;
        private Image pacmanDownImage;
        private Image pacmanLeftImage;
        private Image pacmanRightImage;

        PacMan(){
            setPreferredSize(new Dimension(boardWidth, boardHeight));
            setBackground(Color.BLACK);

            // Load images
            wallImage = new ImageIcon(getClass().getResource("/Images/wall.png")).getImage();
            blueghostImage = new ImageIcon(getClass().getResource("/Images/blueGhost.png")).getImage();
            pinkghostImage = new ImageIcon(getClass().getResource("/Images/pinkGhost.png")).getImage();
            orangeghostImage = new ImageIcon(getClass().getResource("/Images/orangeGhost.png")).getImage();
            redghostImage = new ImageIcon(getClass().getResource("/Images/redGhost.png")).getImage();
            
            pacmanUpImage = new ImageIcon(getClass().getResource("/Images/pacmanUp.png")).getImage();
            pacmanDownImage = new ImageIcon(getClass().getResource("/Images/pacmanDown.png")).getImage();
            pacmanLeftImage = new ImageIcon(getClass().getResource("/Images/pacmanLeft.png")).getImage();
            pacmanRightImage = new ImageIcon(getClass().getResource("/Images/pacmanRight.png")).getImage();
        }
}
