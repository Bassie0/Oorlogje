package oorlogje;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Bastiaan
 */
public class MilanBot extends Player {
    
    Image art;
    private int posX = 0;
    private int posY = 0;
    
    public MilanBot() {
        art = Toolkit.getDefaultToolkit().createImage("C:/Users/Bastiaan/OneDrive/Documenten/Game/Oorlogje/Oorlogje/src/oorlogje/poppetje.jpg");
    }
    
    @Override
    void drawPlayer(Graphics g) {
        g.drawImage(art, posX, posY, null);
    }

    @Override
    void ability() {
    }
    
    public void updatePos(int dx, int dy) {
        posX += dx;
        posY += dy;
    }
    
    int getPosX() {
        return posX;
    }
    
    int getPosY() {
        return posY;
    }
}
