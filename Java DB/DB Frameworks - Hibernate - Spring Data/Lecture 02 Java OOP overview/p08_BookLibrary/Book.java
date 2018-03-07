package hw02_OOP_Overview.p08_BookLibrary;

import java.util.Date;

class Book {
    private String title;
    private String author;
    private String date;
    private String isbn;
    private Double price;

    Book(String title, String author, String date, String isbn, Double price) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.isbn = isbn;
        this.price = price;
    }

    String getAuthor() {
        return this.author;
    }

    Double getPrice() {
        return this.price;
    }
}
