// CLASS: blueprint / template that CREATE objects. It stores methods/functions and data, etc. 
// CLASS HEADER
public class Robot {
    // Attributes/data:
    // private instance variables

    private String name;
    private String serial;
    private double battery;
    private boolean isOn; 

    // Constructor:
    // Special method: starting point for new objects
    // No return type, same name as class
    // ARGUMENTS in the parentheses, not parameters

    public Robot(String name, String serial, double battery) {
        // THIS: instance variable vs. parameter
        this.name = name;
        this.serial = serial;
        this.battery = battery;

        this.isOn = false;
    }

    // Getter/Accessor: return type matches variable
    public String getName() {
        return name;
    }

    public double getBattery() {
        return battery;
     }

     // BOOLEAN getter:
     public boolean isOn() {
        return isOn;
     }

     // Setters/mutators:
     // Always void
     // PARAMETER receives and ARGUMENT

     public void setName(String newName) {
        name = newName;
     }

     public String toString() {
        return name + "[" + serial + "]";
     }

    // indexOf: returns index, or -1 if not found
    public int serialContains(String part) {
        return serial.indexOf(part);
    }

    public boolean boolSerialContains(String part) {
        return serial.indexOf(part) != -1;
    }

    public void chargeBattery(double hours) {
        battery += (hours * 10);
        if(battery > 100) {
            battery = 100;
        }
    }

}