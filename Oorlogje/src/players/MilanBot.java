package players;

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
    public void drawPlayer(Graphics g) {
        g.drawImage(art, posX, posY, null);
    }

    @Override
    public void ability() {
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

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
