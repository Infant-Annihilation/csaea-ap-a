public class LibraryTester{

    public static void main(String[] args) {
        Library book1 = new Library("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 223, "Scholastic", 1998);
        Library book2 = new Library("Project Hail Mary", "Andy Weir", 476, "Ballantine Books", 2021);

        book1.displayBookInfo();
        book2.displayBookInfo();

        book1.assignDeweyDecimal(823.754);
        book1.borrowBook();
        book1.passDayWithBook();
        book1.passDayWithBook();
        book1.checkDueStatus();
        book1.returnBook();

        book2.borrowBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.passDayWithBook();
        book2.checkDueStatus();
        book2.ripPage();
        book2.returnBook();

        book1.displayBookInfo();
        book2.displayBookInfo();

        book1.passDayWithBook();
        book2.returnBook();

        book2.displayDebt();
        book2.payDebt(.25);

    }
}