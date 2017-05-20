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

    private char[] keyCodeKick;
    private char[] keyCodePunch;
    private char[] keyCodeLeft;
    private char[] keyCodeRight;
    
    public Settings() {
        keyCodePunch = KEYCODEPUNCH;
        keyCodeLeft = KEYCODELEFT;
        keyCodeRight = KEYCODERIGHT;
        keyCodeKick = KEYCODEKICK;
    }

    public char[] getKeyCodePunch() {
        return keyCodePunch;
    }

    public char[] getKeyCodeLeft() {
        return keyCodeLeft;
    }

    public char[] getKeyCodeRight() {
        return keyCodeRight;
    }

    public char[] getKeyCodeKick() {
        return keyCodeKick;
    }

    public void setKeyCodePunch(char[] keyCodePunch) {
        this.keyCodePunch = keyCodePunch;
    }

    public void setKeyCodeLeft(char[] keyCodeLeft) {
        this.keyCodeLeft = keyCodeLeft;
    }

    public void setKeyCodeRight(char[] keyCodeRight) {
        this.keyCodeRight = keyCodeRight;
    }

    public void setKeyCodeKick(char[] keyCodeKick) {
        this.keyCodeKick = keyCodeKick;
    }
}
