package model;

/**
 * Created by jakob on 22-09-16.
 */
public class Book {
    private String author;
    private String title;
    private int year;
    private String ISBN;

    public Book(String author, String t, int year, String ISBN) {
        this.author = author;
        this.title = t;
        this.year = year;
        this.ISBN = ISBN;
    }

    public int getYear(){
        return year;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String toString() {
        return "\nTitle: "+title+"\n"+"Author: "+author+"\n"+"Year: "+year+"\n"+"ISBN: "+ISBN+"\n";
    }
}
