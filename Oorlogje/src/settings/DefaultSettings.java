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
public interface DefaultSettings {
    Image MAP = Toolkit.getDefaultToolkit().createImage(".\\zandmapje.jpg");
    int HEIGHT = 648;
    int WIDTH = 1152;
    char KICKBUTTONNUMBER = 0;
    char PUNCHBUTTONNUMBER = 1;
    char LEFTBUTTONNUMBER = 2;
    char RIGHTBUTTONNUMBER = 3;
    char[] KEYCODES = {' ', '\n', 'a', 'd'};
    int UPDATEINTERVAL = 1000/60; // 1000 : 60
    int FLOORHEIGHT = HEIGHT - 100;
}
