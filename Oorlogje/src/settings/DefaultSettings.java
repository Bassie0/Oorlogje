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
    Image PLAYERSPRITE = Toolkit.getDefaultToolkit().createImage(".\\poppetje.jpg");
    char KICKBUTTONNUMBER = 0;
    char PUNCHBUTTONNUMBER = 1;
    char LEFTBUTTONNUMBER = 2;
    char RIGHTBUTTONNUMBER = 3;
    char[] KEYCODEKICK = {KICKBUTTONNUMBER,'w'};
    char[] KEYCODEPUNCH = {PUNCHBUTTONNUMBER,'s'};
    char[] KEYCODELEFT = {LEFTBUTTONNUMBER,'a'};
    char[] KEYCODERIGHT = {RIGHTBUTTONNUMBER,'d'};
}
