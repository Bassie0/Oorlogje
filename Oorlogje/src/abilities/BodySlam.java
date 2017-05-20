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
public class BodySlam extends Ability {

    public BodySlam() {
        DAMAGE = 30;
        COOLDOWN = 5f; 
        KNOCKBACK = 2; 
    }
    @Override
    public void drawAbility() {
        
    }
    
}
