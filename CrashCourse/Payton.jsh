import module java.base;
public class Sneaker {
    private String brand;
    private String model;
    private double size;
    private String color;
    private double price;
    private int releaseYear;
    private String material;
    private boolean isLimitedEdition;
    private boolean isSold;
    private int amountInStock;


    public Sneaker(String brand, String model, double size) { 
        this.brand = brand;
        this.model = model;
        this.size = size;

        isSold = false;
        isLimitedEdition = false;

    }

    public void changeColor(String newColor) {
        color = newColor;

    }

    public void changeSize(double newSize) {
        size = newSize;

    }

    public void changePrice(double newPrice) {
        price = newPrice;

    }

    public void sell() {
        isSold = true;
        amountInStock -= 1;

    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + "\n" + "Model: " + model + "\n" + "Size: " + size + "\n" + "Color: " + color + "\n" + "Price: " + price + "\n" + "Release year: " + releaseYear + "\n" + "Material: " + material + "\n" + "Limited Edition status: " + isLimitedEdition + "\n" + "Sell status: " + isSold + "\n" + "Amount in stock: " + amountInStock + "\n");
    }

    public void receiveShipment() {
        amountInStock += 3;
    }
}
Sneaker nike1 = new Sneaker(Nike, Air Force 1, 9.5);
Sneaker nike1 = new Sneaker("Nike", "Air Force 1", 9.5);
Sneaker nike2 = new Sneaker("Nike", "Air Max", 8.0);
Sneaker adidas1 = new Sneaker("Adidas", "Samba", 10.5);
Sneaker adidas2 = new Sneaker("Adidas", "Gazelle", 8.5);
Sneaker newBalance1 = new Sneaker("New Balance", "430", 10.0);
Sneaker1.brand
nike1.brand
nike1.model
nike1.size
nike1.color
nike1.price
nike1.releaseYear
nike1.material
nike1.isLimitedEdition
nike1.isSold
nike1.amountInStock
nike1.changeColor("Black")
nike1.changeSize(9.0)
nike1.changePrice(75.00)
nike1.sell()
nike1.displayInfo()
nike1.receiveShipment()
nike1.displayInfo()