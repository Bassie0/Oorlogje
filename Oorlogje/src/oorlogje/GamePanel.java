package oorlogje;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Bastiaan
 */
public class GamePanel extends javax.swing.JPanel {
    
    Player p1;
    Player p2;
    
    /**
     * Creates new form GamePanel
     */
    public GamePanel() {
        initComponents();
        p1 = new AIEasy();
        p2 = new HumanPlayer();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        p1.drawPlayer(g);
        p2.drawPlayer(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(102, 255, 153));
        setPreferredSize(new java.awt.Dimension(930, 626));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
