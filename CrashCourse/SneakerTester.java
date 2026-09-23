// package CrashCourse;

public class SneakerTester {

    public static void main(String[] args) {

        Sneaker vans1 = new Sneaker("Vans", "Authentic", 9.5);
        Sneaker vans2 = new Sneaker("Vans", "Classic Slip-On", 7.0);

        vans1.changeColor("Green");
        vans1.changePrice(65.00);
        vans1.receiveShipment();
        vans1.sell();
        
        vans2.receiveShipment();
        vans2.changeColor("Red");
        vans2.changePrice(75.00);

        vans1.displayInfo();
        vans2.displayInfo();

    }
}