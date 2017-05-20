package abilities;

/**
 *
 * @author Bastiaan
 */
public abstract class Ability {
    private final int MAXCOOLDOWN = 100;
    float COOLDOWN;
    int DAMAGE;
    int KNOCKBACK;

    public float getCOOLDOWN() {
        return COOLDOWN;
    }

    public int getMAXCOOLDOWN() {
        return MAXCOOLDOWN;
    }
    
    public abstract void drawAbility();
}
