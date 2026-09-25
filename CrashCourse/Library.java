public class Library {
    
    private String bookTitle;
    private String bookAuthor;
    private int pageCount;
    private double deweyDecimal;
    private boolean isBorrowed;
    private boolean isPastDue;
    private String bookPublisher;
    private int bookPublishYear;
    private int daysWithBook;

    
    public Library(String bookTitle, String bookAuthor, int pageCount, String bookPublisher, int bookPublishYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.pageCount = pageCount;
        this.bookPublisher = bookPublisher;
        this.bookPublishYear = bookPublishYear;

        isBorrowed = false;
        isPastDue = false;
        daysWithBook = 0;

    }

    public void assignDeweyDecimal(double newDeweyDecimal) {
        deweyDecimal = newDeweyDecimal;
        System.out.println("You have assigned " + bookTitle + " a Dewey Decimal number." + "\n");

    }

    public void borrowBook() {
        if(isBorrowed) {
            System.out.println(bookTitle + " is currently borrowed.");
        } else {
            System.out.println("You have borrowed " + bookTitle + "\n");
            isBorrowed = true;
            daysWithBook += 1;
        }

    }

    public void returnBook() {
        if(isBorrowed) {
            System.out.println("You have returned " + bookTitle + "\n");
            isBorrowed = false;
            daysWithBook = 0;
            isPastDue = false;
        } else {
            System.out.println("You haven't borrowed this book, so you can't return it." + "\n");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + bookTitle + "\n" + "Author: " + bookAuthor + "\n" + "Page count: " + pageCount + "\n" + "Dewey Decimal: " + deweyDecimal + "\n" + "Borrow status: " + isBorrowed + "\n" + "Overdue status: " + isPastDue + "\n" + "Publisher: " + bookPublisher + "\n" + "Year published: " + bookPublishYear + "\n");

    }

    public void ripPage() {
        System.out.println("You tore out a page... Why would you do that..." + "\n");
        pageCount -= 1;

    }

    public void passDayWithBook() {
        if(isBorrowed) {
            if(daysWithBook > 10) {
                System.out.println("This book is overdue!" + "\n");
                isPastDue = true;
            }
            System.out.println("You have had this book for " + daysWithBook + " day(s)." + "\n");
            daysWithBook += 1;
        } else {
            System.out.println("You don't have this book." + "\n");
        }
    }

    public void checkDueStatus() {
        if(isBorrowed) {
            if(daysWithBook <= 10) {
                System.out.println("Days left with book: ");
                System.out.println(10 - daysWithBook);
                System.out.println();
            } else {
                System.out.println("This book is past due!" + "\n");
            }
        } else {
            System.out.println("You don't have this book." + "\n");
        }
    }
    
}
