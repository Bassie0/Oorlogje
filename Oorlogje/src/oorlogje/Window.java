package oorlogje;

import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;

/**
 *
 * @author Bastiaan
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        multiplayer = new javax.swing.JButton();
        start = new javax.swing.JButton();
        gamePanel = new GamePanel();
        optionsAI = new javax.swing.JLabel();
        mapOptions = new javax.swing.JLabel();
        desert = new javax.swing.JButton();
        city = new javax.swing.JButton();
        boat = new javax.swing.JButton();
        controls = new javax.swing.JLabel();
        setWalkLeft = new javax.swing.JButton();
        setWalkRight = new javax.swing.JButton();
        setPunch = new javax.swing.JButton();
        setKick = new javax.swing.JButton();
        walkLeft = new javax.swing.JLabel();
        walkRight = new javax.swing.JLabel();
        punch = new javax.swing.JLabel();
        kick = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mortal Kombat XV");

        multiplayer.setText("multiplayer");

        start.setText("Start game");

        gamePanel.setPreferredSize(new java.awt.Dimension(930, 626));

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1152, Short.MAX_VALUE)
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        optionsAI.setText("bot opties");

        mapOptions.setText("map optie");

        desert.setText("woestijn");

        city.setText("stad");

        boat.setText("boot");

        controls.setText("controls");

        setWalkLeft.setText("a");
        setWalkLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setWalkLeftActionPerformed(evt);
            }
        });
        setWalkLeft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                setWalkLeftKeyPressed(evt);
            }
        });
        setWalkLeft.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");

        setWalkRight.setText("d");
        setWalkRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setWalkRightActionPerformed(evt);
            }
        });
        setWalkRight.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");

        setPunch.setText("  space");
        setPunch.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");

        setKick.setText("enter");
        setKick.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");

        walkLeft.setText("walk left");

        walkRight.setText("walk right");

        punch.setText("punch");

        kick.setText("kick");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(1158, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(walkRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(walkLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(punch)
                            .addComponent(kick))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(setWalkLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setWalkRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setPunch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setKick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(optionsAI, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplayer, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(controls)
                            .addComponent(mapOptions)
                            .addComponent(desert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multiplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(controls)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setWalkLeft)
                            .addComponent(walkLeft))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setWalkRight)
                            .addComponent(walkRight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setPunch)
                            .addComponent(punch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setKick)
                            .addComponent(kick))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(mapOptions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desert)
                        .addGap(23, 23, 23)
                        .addComponent(city)
                        .addGap(18, 18, 18)
                        .addComponent(boat)
                        .addGap(40, 40, 40)
                        .addComponent(optionsAI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //KeyCodes
    final int SPACE = 32;
    final int TAB = 9;
    final int ENTER = 13;
    final int SHIFT = 16;
    final int CTRL = 17;
    final int ALT = 18;
    
    private void setWalkLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setWalkLeftActionPerformed
        // TODO add your handling code here:
        setWalkLeft.setFocusable(true);
        setWalkLeft.requestFocus();
    }//GEN-LAST:event_setWalkLeftActionPerformed

    private void setWalkLeftKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_setWalkLeftKeyPressed
        // TODO add your handling code here:
        String keyTyped = Character.toString(evt.getKeyChar());
        if(KeyEvent.CHAR_UNDEFINED == evt.getKeyChar() || SPACE == evt.getKeyCode()) {
            switch(evt.getKeyCode()) {
                case SPACE: keyTyped = "SPACE";
                    break;
                case TAB: keyTyped = "TAB";
                    break;
                case ENTER: keyTyped = "ENTER";
                    break;
                case SHIFT: keyTyped = "SHIFT";
                    break;
                case CTRL: keyTyped = "CTRL";
                    break;
                case ALT: keyTyped = "ALT";
                    break;
            }
        }
        setWalkLeft.setText(keyTyped);
        setWalkLeft.setFocusable(false);
    }//GEN-LAST:event_setWalkLeftKeyPressed

    private void setWalkRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setWalkRightActionPerformed
        // TODO add your handling code here:
        setWalkLeft.setFocusable(true);
        setWalkLeft.requestFocus();
    }//GEN-LAST:event_setWalkRightActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Window window = new Window();
                window.setVisible(true);
                window.gamePanel.repaint();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton city;
    private javax.swing.JLabel controls;
    private javax.swing.JButton desert;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel kick;
    private javax.swing.JLabel mapOptions;
    private javax.swing.JButton multiplayer;
    private javax.swing.JLabel optionsAI;
    private javax.swing.JLabel punch;
    private javax.swing.JButton setKick;
    private javax.swing.JButton setPunch;
    private javax.swing.JButton setWalkLeft;
    private javax.swing.JButton setWalkRight;
    private javax.swing.JButton start;
    private javax.swing.JLabel walkLeft;
    private javax.swing.JLabel walkRight;
    // End of variables declaration//GEN-END:variables
}
