/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings;

/**
 *
 * @author meviu
 */
public class Settings implements DefaultSettings{

    private char[] keyCodes = new char[4];
    
    public Settings() {
        keyCodes = KEYCODES;
    }

    public char getKeyCodePunch() {
        return keyCodes[PUNCHBUTTONNUMBER];
    }

    public char getKeyCodeLeft() {
        return keyCodes[LEFTBUTTONNUMBER];
    }

    public char getKeyCodeRight() {
        return keyCodes[RIGHTBUTTONNUMBER];
    }

    public char getKeyCodeKick() {
        return keyCodes[KICKBUTTONNUMBER];
    }

    public void setKeyCodePunch(char keyCodePunch) {
        this.keyCodes[PUNCHBUTTONNUMBER] = Character.toLowerCase(keyCodePunch);
    }

    public void setKeyCodeLeft(char keyCodeLeft) {
        this.keyCodes[LEFTBUTTONNUMBER] = Character.toLowerCase(keyCodeLeft);
    }

    public void setKeyCodeRight(char keyCodeRight) {
        this.keyCodes[RIGHTBUTTONNUMBER] = Character.toLowerCase(keyCodeRight);
    }

    public void setKeyCodeKick(char keyCodeKick) {
        this.keyCodes[KICKBUTTONNUMBER] = Character.toLowerCase(keyCodeKick);
    }
}
