
class LibraryBook {
    String title;
    String author;
    double price;

    // Static variable
    static int bookCount = 0;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    // Static method
    static void displayBookCount() {
        System.out.println("Total Number of Books: " + bookCount);
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
        System.out.println();
    }
}

public class LibraryBookCounter {

    public static void main(String[] args) {

        LibraryBook book1 =
                new LibraryBook("Java Programming", "James", 450);

        LibraryBook book2 =
                new LibraryBook("Python Basics", "John", 350);

        LibraryBook book3 =
                new LibraryBook("Data Structures", "Robert", 500);

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        LibraryBook.displayBookCount();
    }
}
