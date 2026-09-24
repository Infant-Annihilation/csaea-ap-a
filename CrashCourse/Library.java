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

    }

    public void borrowBook() {
        if(isBorrowed) {
            System.out.println(bookTitle + " is currently borrowed.");
        } else {
            System.out.println("You have borrowed " + bookTitle);
            isBorrowed = true;
            daysWithBook += 1;
        }

    }

    public void returnBook() {
        if(isBorrowed) {
            System.out.println("You have returned " + bookTitle);
            isBorrowed = false;
            daysWithBook = 0;
        } else {
            System.out.println("You haven't borrowed this book, so you can't return it.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + bookTitle + "\n" + "Author: " + bookAuthor + "\n" + "Page count: " + pageCount + "\n" + "Dewey Decimal: " + deweyDecimal + "\n" + "Borrow status: " + isBorrowed + "\n" + "Overdue status: " + isPastDue + "\n" + "Publisher: " + bookPublisher + "\n" + "Year published: " + bookPublishYear + "\n");

    }

    public void ripPage() {
        System.out.println("You tore out a page... Why would you do that...");
        pageCount -= 1;

    }

    public void passDayWithBook() {
        if(isBorrowed) {
            System.out.println("You have had this book for " + daysWithBook + " days.");
            daysWithBook += 1;
            if(daysWithBook > 10) {
                System.out.println("This book is overdue!");
                isPastDue = true;
            }
        } else {
            System.out.println("You don't have this book.");
        }
    }

    public void checkDueStatus() {
        if(isBorrowed) {
            if(daysWithBook <= 10) {
                System.out.println("Days left with book: ");
                System.out.println(10 - daysWithBook);
            } else {
                System.out.println("This book is past due!");
            }
        } else {
            System.out.println("You don't have this book.");
        }
    }
    
}
