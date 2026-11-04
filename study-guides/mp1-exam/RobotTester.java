// TESTER CLASS: separate class, holds main
public class RobotTester {
    public static void main(String[] args) {

        // Object: specific instance of a class
        // INSTANTIATION: new + constructor call

        Robot r1 = new Robot("Rover", "RX-77-B", 8.0);
        Robot r2 = new Robot("Unit", "TK-21", 3.0);

        System.out.println(r1); // returns? The MEMORY ADDRESS!
                                // however, with toString, the print statement does whatever is in the toString method!
        
        Robot r3 = r1;
        System.out.println(r3); // r3 doesn't have a memory address of its own, it refers to that of r1

        System.out.println();

        r3.setName("Scout");
        System.out.println(r1.getName()); // since r3 is set equal to r1, it changes r1 too!

        System.out.println();
        // "==" compares objects
        System.out.println(r1 == r3);
        System.out.println(r1 == r2);

        System.out.println();
        // == vs .equals() on Strings
        String s1 = "RX-77-B";
        String s2 = new String("RX-77-B");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        // "RX-77-B"
        System.out.println(r1.serialContains("77"));
        System.out.println(r1.serialContains("rx"));

        System.out.println(r1.boolSerialContains("77"));
        System.out.println(r1.boolSerialContains("rx"));

        System.out.println();
        Robot johnny = new Robot("Johnny", "55-JXD-9R", 95.2);
        johnny.chargeBattery(3.0);
        System.out.println(johnny.getBattery());

        System.out.println(johnny);

        r1.chargeBattery(5.7);
        r2.chargeBattery(5.7);

        System.out.println(r1.getBattery());
        System.out.println(r2.getBattery());
    }
}