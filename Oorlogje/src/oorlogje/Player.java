package oorlogje;

/**
 *
 * @author Bastiaan
 */
public abstract class Player {
    
    int height = 100;
    int width = 30;
    int posX = 0;
    int posY = 0;
    
    public Player () {
        
    }
    
    public void Move() {
        
    }
    
    abstract void drawPlayer();
    abstract void ability();
    
}
