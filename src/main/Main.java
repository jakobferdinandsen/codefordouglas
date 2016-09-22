package main;

import model.Book;
import model.Bookcase;

/**
 * Created by jakob on 22-09-16.
 */
public class Main {
    public static void main(String[] args) {
        Bookcase bookcase = new Bookcase();

        bookcase.storeBook(new Book("Hans", "New book", 1233, "12341"));
        bookcase.storeBook(new Book("Bob", "New book", 1233, "12341"));
        bookcase.storeBook(new Book("Bob", "New book", 1920, "12341"));
        bookcase.storeBook(new Book("Alice", "New book", 1234, "12341"));
        bookcase.listAllBooks();
        bookcase.removeBook(3);
        bookcase.listAllBooks();
        //bookcase.listBooksWrittenBy("Bob");
    }
}
