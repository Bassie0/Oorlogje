package oorlogje;

import java.awt.Graphics;

/**
 *
 * @author Bastiaan
 */
public abstract class Player {
    
    int height = 100;
    int width = 30;
    
    public Player () {
        
    }
    
    public void Move() {
        
    }
    
    abstract void drawPlayer(Graphics g);
    abstract void ability();
    
}
