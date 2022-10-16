package entity;

import main.GamePanel;
import main.KeyHandler;

public class Snake extends Entity{
    private GamePanel gp;
    private KeyHandler keyHandler;
    private int playerSpeed = 5;
    private int playerLength = 3;

    public Snake(GamePanel gp, KeyHandler keyHandler) {
        this.gp = gp;
        this.keyHandler = keyHandler;
        setX(338);
        setY(100);
        setSpeed(playerSpeed);
        setDirection("down");
        setPlayerLength(playerLength);
    }

    public void getSnakeImage() {

    }



    public int getPlayerLength() {
        return playerLength;
    }

    public void setPlayerLength(int playerLength) {
        this.playerLength = playerLength;
    }
}
