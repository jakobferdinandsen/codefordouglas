package model;

import java.util.ArrayList;

/**
 * Created by jakob on 22-09-16.
 */
public class Bookcase {
    private ArrayList<Book> books;

    public Bookcase() {
        books = new ArrayList<>();
    }

    public void storeBook(Book b) {
        books.add(b);
    }

    public int numberOfBooks() {
        return books.size();
    }

    public void removeBook(int index) {
        books.remove(index);
    }

    public void listAllBooks() {
        for (Book book :
                books) {
            System.out.println(book);
        }
    }

    public void listBooksWrittenBy(String author) {
        for (Book book :
                books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }
    public ArrayList<Book> getBooksPublishedby(int year) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book :
                books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }
}
