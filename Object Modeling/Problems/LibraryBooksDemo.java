import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author);
        }
    }
}

public class LibraryBooksDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Author A");
        Book b2 = new Book("OOP Concepts", "Author B");
        Book b3 = new Book("Data Structures", "Author C");

        Library lib1 = new Library();
        Library lib2 = new Library();

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        System.out.println("Library 1 books:");
        lib1.showBooks();

        System.out.println("\nLibrary 2 books:");
        lib2.showBooks();
    }
}
