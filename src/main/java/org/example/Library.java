package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library = new ArrayList<>();
    public void addBook(Book book){
        library.add(book);
    }
    public void showBook(){
        for(Book book : library){
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Isbn: " + book.getIsbn());
            System.out.println("Year: " + book.getYear());
            System.out.println("----------------------------");
        }
    }
    public Book findBook(String bookTitle){
        for(Book book : library){
            if(book.getTitle().equals(bookTitle)){
                return book;
            }
        }
        return null;
    }
    public String removeBook(String bookIsbn){
        for(Book book : library){
            if(book.getIsbn().equals(bookIsbn)){
                library.remove(book);
                return "The book was removed!";
            }
        }
        return "The book was not found!";
    }
    public void showBookInfo(Book book){
        System.out.println("Title: "+ book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Isbn: " + book.getIsbn());
        System.out.println("Year: " + book.getYear());
        System.out.println("----------------------------");
    }
}
