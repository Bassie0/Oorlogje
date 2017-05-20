/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abilities;

/**
 *
 * @author Milan
 */
public class SpecialAttack extends Ability {
    
    private final int MAXRAGE = 100;
    private int RAGE = 0;
    private final int ADDRAGE = 3;

    public SpecialAttack() {
        COOLDOWN = getMAXCOOLDOWN();
    }

    public void addRAGE(int RAGE) {
        this.RAGE += RAGE;
    }
    
    public void subRAGE(int RAGE) {
        this.RAGE -= RAGE;
    }

    public int getRAGE() {
        return RAGE;
    }
    
    @Override
    public void drawAbility() {
        
    }
    
}
