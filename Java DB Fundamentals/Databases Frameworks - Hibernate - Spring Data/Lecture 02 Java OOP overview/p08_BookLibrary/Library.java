package hw02_OOP_Overview.p08_BookLibrary;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Library {
    private String name;
    private List<Book> bookList;
    private Map<String, Double> moneyByAuthor;

    Library(String name, List<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
        this.moneyByAuthor = new TreeMap<>();
    }

    Iterator<Book> getBooks(){
        return this.bookList.iterator();
    }

    void addBook(Book book){
        this.bookList.add(book);
        this.moneyByAuthor.putIfAbsent(book.getAuthor(), 0d);
        this.moneyByAuthor.put(book.getAuthor(), this.moneyByAuthor.get(book.getAuthor())+ book.getPrice());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        this.moneyByAuthor
                .entrySet()
                .stream()
                .sorted((a1, a2) -> Double.compare(a2.getValue(), a1.getValue()))
                .forEach(e -> sb.append(String.format("%s -> %.2f", e.getKey(), e.getValue())).append(System.lineSeparator()));

        return sb.toString().trim();
    }
}
