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
    private int daysPastDue;
    private double debt;

    
    public Library(String bookTitle, String bookAuthor, int pageCount, String bookPublisher, int bookPublishYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.pageCount = pageCount;
        this.bookPublisher = bookPublisher;
        this.bookPublishYear = bookPublishYear;

        isBorrowed = false;
        isPastDue = false;
        daysWithBook = 0;
        daysPastDue = 0;
        debt = 0;

    }

    public void assignDeweyDecimal(double newDeweyDecimal) {
        deweyDecimal = newDeweyDecimal;
        System.out.println("You have assigned " + bookTitle + " a Dewey Decimal number.\n");

    }

    public void borrowBook() {
        if(isBorrowed) {
            System.out.println(bookTitle + " is currently borrowed.\n");
        } else {
            System.out.println("You have borrowed " + bookTitle + "\n");
            isBorrowed = true;
        }

    }

    public void returnBook() {
        if(isBorrowed) {
            System.out.println("You have returned " + bookTitle + "\n");
            isBorrowed = false;
            daysWithBook = 0;
            isPastDue = false;
            daysPastDue = 0;
        } else {
            System.out.println("You haven't borrowed this book, so you can't return it.\n");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + bookTitle + "\n" + "Author: " + bookAuthor + "\n" + "Page count: " + pageCount + "\n" + "Dewey Decimal: " + deweyDecimal + "\n" + "Borrow status: " + isBorrowed + "\n" + "Overdue status: " + isPastDue + "\n" + "Publisher: " + bookPublisher + "\n" + "Year published: " + bookPublishYear + "\n" + "Days past due: " + daysPastDue + "\n");

    }

    public void ripPage() {
        System.out.println("You tore out a page... Why would you do that...\n");
        pageCount -= 1;

    }

    public void passDayWithBook() {
        if(isBorrowed) {
            daysWithBook += 1;
            if(daysWithBook > 10) {
                System.out.println("This book is overdue!\n");
                isPastDue = true;
                daysPastDue += 1;
                debt += .25;
            }
            System.out.println("You have had this book for " + daysWithBook + " day(s).\n");
        } else {
            System.out.println("You don't have this book.\n");
        }
    }

    public void checkDueStatus() {
        if(isBorrowed) {
            if(daysWithBook <= 10) {
                System.out.println("Days left with book: ");
                System.out.println(10 - daysWithBook);
                System.out.println();
            } else {
                System.out.println("This book is past due!\n");
            }
        } else {
            System.out.println("You don't have this book.\n");
        }
    }

    public void displayDebt() {
        System.out.println("Your current debt is $" + String.format("%.2f", debt) + "\n");
    }

    public void payDebt(double amountPaid) {
        if(amountPaid > 0) {
            debt -= amountPaid;
            if(debt < 0) {
                debt = 0;
            }
            System.out.println("You paid $" + String.format("%.2f", amountPaid) + ".\n");
            System.out.println("Remaining debt: $" + String.format("%.2f", debt) + "\n");
        } else {
            System.out.println("Payment must be greater than 0.\n");
        }
    }
    
}
