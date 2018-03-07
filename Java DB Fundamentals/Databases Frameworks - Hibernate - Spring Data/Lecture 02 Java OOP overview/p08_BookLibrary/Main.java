package hw02_OOP_Overview.p08_BookLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

import java.util.ArrayList;

import java.util.List;

public class Main {
    private static List<Book> bookList;

    public static void main(String[] args) throws IOException, ParseException {
        bookList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfBooks = Integer.parseInt(reader.readLine());

        Library library = new Library("nameOfLibrary", bookList);

        for (int i = 0; i < countOfBooks; i++) {
            String[] tokens = reader.readLine().split(" ");

            String title = tokens[0];
            String author = tokens[1];
            String date = (tokens[3]);
            String isbn = tokens[4];
            Double price = Double.valueOf(tokens[5]);
            Book book = new Book(title,author,date,isbn,price);

            bookList.add(book);

            library.addBook(book);
        }
        System.out.println(library);

    }
}
