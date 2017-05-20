package players;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Bastiaan
 */
public abstract class Player {
    
    private int height = 100;
    private int width = 30;
    
    Image playerSprite = Toolkit.getDefaultToolkit().createImage(".\\poppetje.jpg");
    
    public Player () {
        
    }
    
    public void Move() {
        
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public abstract void drawPlayer(Graphics g);
    public abstract void ability();
    public abstract void update();
    
}
