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
public class Kick extends Ability{

    public Kick() {
        DAMAGE = 10;
        COOLDOWN = 0.6f; 
        KNOCKBACK = 0;
    }

    @Override
    public void drawAbility() {
       
    }
    
}
