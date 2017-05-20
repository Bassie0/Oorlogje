package players;

import java.awt.Graphics;
import java.awt.Image;
import settings.DefaultSettings;
import static windows.Window.settings;

/**
 *
 * @author Bastiaan
 */
public abstract class Player implements DefaultSettings {
    
    int SPEED = 5;
    int HEIGHT = 100;
    int WIDTH = 30;
    int xPos = 0;
    int yPos = 0;
    
    Image playerSprite;
    
    public Player () {
        playerSprite = PLAYERSPRITE;
    }
    
    public void move(java.awt.event.KeyEvent evt) {
        if(evt.getKeyChar() == settings.getKeyCodeLeft()[1]) {
            xPos -= 5;
        } else if(evt.getKeyChar() == settings.getKeyCodeRight()[1]) {
            yPos += 5;
        }
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight() {
        return HEIGHT;
    }

    public void setWidth(int width) {
        this.WIDTH = width;
    }

    public void setHeight(int height) {
        this.HEIGHT = height;
    }
    
    public abstract void drawPlayer(Graphics g);
    public abstract void ability();
    public abstract void update();
    
}
