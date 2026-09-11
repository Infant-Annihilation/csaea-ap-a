package CrashCourse;

public class Knight {
    
    // 1. Data / attributes

    String characterName;
    int health; // 0 - 100
    int energyLevel; // 0 - 100
    boolean isHoly;
    int strength; // at least 1
    boolean hasWeapon;
    int speed; // 0 - 100
    int damage;

    // 2. Constructor
    // special method, only runs when we CREATE a Knight object

    public Knight(String characterName, int health, boolean isHoly) {
        this.characterName = characterName;
        this.health = health;
        this.isHoly = isHoly;

        energyLevel = 75;
        strength = 10;
        hasWeapon = true;
        speed = 30;
        damage = 15;

    }

    // 3. Behaviors

    public void eat() {
        energyLevel += 25;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    
    }

    public void breakWeapon() {
        hasWeapon = false;
        damage /= 2;
    }

    public void workOut() {
        strength += 1;
        energyLevel -= 4;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            System.out.println("You died.");
        }
    }

    
}
