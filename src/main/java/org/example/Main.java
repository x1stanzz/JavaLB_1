package org.example;


public class Main {
    public static void main(String[] args) {
        /*
            todo:
             1. Create classes named Book and Library that represent them
             2. Create fields/methods inside those classes:
                -- Book: Title, Author, ISBN, Year
                -- Library: addBook(), showBooks(), findBook(), removeBook()
             3. Create a method that will add books to the library
             4. Create a method to show all books in the library
             5. Create a method to find a book by its title
             6. Create a method to remove a book
             7. Make some test cases
        * */
        //Creating library to keep books
        Library library = new Library();

        //Adding books to the library
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien","333333333", 1937));
        library.addBook(new Book("The Great Gatsby","F.Scott Fitzgerald", "222222222", 1925));
        library.addBook(new Book("The little prince", "Antoine de Saint-Exupery", "111111111", 1943));

        //Checking what library contains
        System.out.println("Library before changes: ");
        library.showBooks();

        //Finding book by its title
        Book isBookFound = library.findBook("The Hobbit");
        if(isBookFound != null){
            System.out.println("The book was found: ");
            library.showBookInfo(isBookFound);
        } else{
            System.out.println("The book was not found!");
        }

        //Attempt to remove a book from library
        //If book is absent, the message will appear
        String isBookRemoved = library.removeBook("111111111");
        System.out.println(isBookRemoved + "\n");
        //Checking library after changes
        System.out.println("Library after changes: ");
        library.showBooks();
    }
}