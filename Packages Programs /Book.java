package mypackage.library;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

import mypackage.library.Book;

public class MainLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling");
        book1.displayBook();
    }
}
