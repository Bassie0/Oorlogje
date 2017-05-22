package players;

import java.awt.Graphics;
import java.awt.Image;
import settings.PlayerSettings;
import static windows.GamePanel.left;
import static windows.GamePanel.right;

/**
 *
 * @author Bastiaan
 */
public abstract class Player implements PlayerSettings {

    int SPEED = DEFAULTSPEED;
    int HEIGHT = DEFAULTHEIGHT;
    int WIDTH = DEFAULTWIDTH;
    int dx = ZERO;
    int dy = ZERO;
    int xPos = ZERO;
    int yPos = FLOORHEIGHT;

    Image playerSprite;

    public Player() {
        playerSprite = PLAYERSPRITE;
    }

    public Player(Image playerSprite) {
        this.playerSprite = playerSprite;
    }

    public void setDx() {
        
        this.dx = (right - left) * SPEED;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight() {
        return HEIGHT;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getSPEED() {
        return SPEED;
    }
    
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    /**
     * Draws the player
     * @param g 
     */
    public void drawPlayer(Graphics g) {
        g.drawImage(playerSprite, xPos, yPos, null);
    }

    public abstract void ability();
    /**
     * Updates the position of the player
     */
    public abstract void updatePos();

}
