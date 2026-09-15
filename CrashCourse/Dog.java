package CrashCourse;

public class Dog {
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

        energyLevel = 50;
        isHungry = true;
        isHome = true;

    }

    public void bark() {
        System.out.println("Woof!");

    }

    public void scratch() {
        System.out.println(name + " scratched you!");

    }

    public void bite() {
        System.out.println(name + " bit something.");

    }

    public void eat() {
        isHungry = false;
        weight += 1;
        energyLevel +=30;

    }

    public void runAway() {
        isHome = false;
        energyLevel -= 20;

    }

    public void comeHome() {
        isHome = true;

    }

    public void sleep() {
        energyLevel +=100;
        if(energyLevel > 100) {
            energyLevel = 100;
        }
    }

    public void birthday() {
        age += 1;

    }
    
}
