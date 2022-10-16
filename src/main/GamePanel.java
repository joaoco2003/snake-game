package main;

import entity.Snake;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    // -------------------------- SCREEN SETTINGS -------------------------------
    final int originalTileSize = 15; //15x15 tile
    final int scale = 3;
    public final int tileSize = originalTileSize * scale; // 45x45 tile
    final int screenSide = tileSize * originalTileSize; // 675 pixels
    // --------------------------------------------------------------------------

    // ------ FPS -------
    final int FPS = 60;
    // ------------------

    KeyHandler keyHandler = new KeyHandler();
    Thread gameThread = new Thread();
    Snake snake = new Snake(this, keyHandler);

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenSide, screenSide));
        this.setBackground(Color.green);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // snake.draw(g2);
        g2.setColor(Color.BLACK);
    }




    @Override
    public void run() {

    }
}
