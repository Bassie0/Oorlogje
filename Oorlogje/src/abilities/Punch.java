/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abilities;

/**
 *
 * @author meviu
 */
public class Punch extends Ability {

    public Punch() {
        DAMAGE = 6 ; 
        COOLDOWN = 0.2f; 
        KNOCKBACK = 0;
    } 
    
    @Override
    public void drawAbility() {
        
    }
    
}
