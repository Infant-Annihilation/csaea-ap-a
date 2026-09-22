// package CrashCourse;

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
