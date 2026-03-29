import javax.swing.JFrame;

public class App{
    public static void main(String[] args) throws Exception {
        int rowcount = 21;
        int columncount = 19;
        int tileSize = 32;
        int boardWidth = columncount * tileSize;
        int boardHeight = rowcount * tileSize;

        JFrame frame = new JFrame("Pacman");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocusInWindow();
        frame.setVisible(true);

    }
}