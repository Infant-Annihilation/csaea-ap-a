package CrashCourse;

public class Hero {
    String characterName;
    int health;
    String primaryWeapon;
    String abilityOne;
    String abilityTwo;
    String abilityThree;
    double movementSpeed;
    String catchphrase;
    boolean isAimed;

    public Hero(String characterName, int health, double movementSpeed) {
        this.characterName = characterName;
        this.health = health;
        this.movementSpeed = movementSpeed;

        isAimed = false;

    }

    public void attack() {
        System.out.println(characterName + "used " + primaryWeapon + " to attack!");

    }

    public void useAbility1() {
        System.out.println(abilityOne + " was used.")

    }

    public void useAbility2() {
        System.out.println(abilityTwo + " was used.");

    }

    public void useAbility3() {
        System.out.println(abilityThree + " was used.");

    }

    public void aim() {
        isAimed = true;

    }
    
}
