import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel{
    public class Block{
        int x;
        int y;
        int width;
        int height;
        Image image;

        int startX;
        int startY;

        Block(int x, int y, int width, int height, Image image){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.image = image;

            this.startX = x;
            this.startY = y;
        }
    }
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

        private String[] tileMap = {
        "XXXXXXXXXXXXXXXXXXX",
        "X        X        X",
        "X XX XXX X XXX XX X",
        "X                 X",
        "X XX X XXXXX X XX X",
        "X    X       X    X",
        "XXXX XXXX XXXX XXXX",
        "OOOX X       X XOOO",
        "XXXX X XXrXX X XXXX",
        "O       bpo       O",
        "XXXX X XXXXX X XXXX",
        "OOOX X       X XOOO",
        "XXXX X XXXXX X XXXX",
        "X        X        X",
        "X XX XXX X XXX XX X",
        "X  X     P     X  X",
        "XX X X XXXXX X X XX",
        "X    X   X   X    X",
        "X XXXXXX X XXXXXX X",
        "X                 X",
        "XXXXXXXXXXXXXXXXXXX" 
    };

        //Creating HashSets to store the walls, food, ghosts, and pacman
        HashSet<Block> walls;
        HashSet<Block> food;
        HashSet<Block> ghosts;
        Block pacman;

        PacMan(){
            setPreferredSize(new Dimension(boardWidth, boardHeight));
            setBackground(Color.BLACK);

            // wallImage = new ImageIcon(getClass().getResource("/Images/wall.png")).getImage();
            wallImage = new ImageIcon("Images/wall.png").getImage();
            // blueghostImage = new ImageIcon(getClass().getResource("/Images/blueGhost.png")).getImage();
            blueghostImage = new ImageIcon("Images/blueGhost.png").getImage();
            // pinkghostImage = new ImageIcon(getClass().getResource("/Images/pinkGhost.png")).getImage();
            pinkghostImage = new ImageIcon("Images/pinkGhost.png").getImage();
            orangeghostImage = new ImageIcon("Images/orangeGhost.png").getImage();
            redghostImage = new ImageIcon("Images/redGhost.png").getImage();

            pacmanUpImage = new ImageIcon("Images/pacmanUp.png").getImage();
            pacmanDownImage = new ImageIcon("Images/pacmanDown.png").getImage();
            pacmanLeftImage = new ImageIcon("Images/pacmanLeft.png").getImage();
            pacmanRightImage = new ImageIcon("Images/pacmanRight.png").getImage();

            //Load the map and initialize the walls, food, ghosts, and pacman
            loadMap();
        }
        public void loadMap(){
            walls = new HashSet<>();
            food = new HashSet<>();
            ghosts = new HashSet<>();

           for( int r = 0; r < rowcount; r++){
                for( int c = 0; c < columncount; c++){
                    String row = tileMap[r];
                    char tileMapChar = row.charAt(c);
                    int x = c * tileSize;
                    int y = r * tileSize;

                    if(tileMapChar == 'X'){//If the tile is a wall, create a new Block object and add it to the walls HashSet
                        Block wall = new Block(x, y, tileSize, tileSize, wallImage);
                        walls.add(wall);
                    }else if (tileMapChar == 'b')//blue ghost
                    {
                        Block blueGhost = new Block(x, y, tileSize, tileSize, blueghostImage);
                        ghosts.add(blueGhost);
                    }else if (tileMapChar == 'p')//pink ghost
                    {
                        Block pinkGhost = new Block(x, y, tileSize, tileSize, pinkghostImage);
                        ghosts.add(pinkGhost);
                    }else if (tileMapChar == 'o')//orange ghost
                    {
                        Block orangeGhost = new Block(x, y, tileSize, tileSize, orangeghostImage);
                        ghosts.add(orangeGhost);
                    }else if (tileMapChar == 'r')//red ghost
                    {
                        Block redGhost = new Block(x, y, tileSize, tileSize, redghostImage);
                        ghosts.add(redGhost);
                    }else if (tileMapChar == 'P')//pacman
                    {
                        pacman = new Block(x, y, tileSize, tileSize, pacmanRightImage);
                    }else if (tileMapChar == ' ')//food
                    {
                        Block foodBlock = new Block(x+14, y+14, 4, 4, null);
                        food.add(foodBlock);
                    }   
        
                }
            }
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            //Draw the walls, food, ghosts, and pacman
            draw(g);
        }

        public void draw(Graphics g){
            g.drawImage(pacman.image,pacman.x, pacman.y, pacman.width, pacman.height, null);

            for (Block ghost : ghosts){
                g.drawImage(ghost.image, ghost.x, ghost.y, ghost.width, ghost.height, null);
            }
        }
}

