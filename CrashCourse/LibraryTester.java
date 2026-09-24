public class LibraryTester{

    public static void main(String[] args) {
        Library book1 = new Library("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 223, "Scholastic", 1998);
        Library book2 = new Library("Project Hail Mary", "Andy Weir", 476, "Ballantine Books", 2021);

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}