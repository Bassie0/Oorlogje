/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author meviu
 */
public interface PlayerSettings {
    Image PLAYERSPRITE = Toolkit.getDefaultToolkit().createImage(".\\poppetje.jpg");
    int DEFAULTSPEED = 5;
    int DEFAULTWIDTH = 30;
    int DEFAULTHEIGHT = 100;
    int ZERO = 0;
}
