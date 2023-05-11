package BooksShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShop {
    public static void main (String [] args){
        System.out.println("You are welcome in book store");
        List <String> books = new ArrayList<>(){{
            add("Java");
            add("Java for beginner");
            add("Java for advanced");
            add("Harry Potter");
        }};
        printMenu();

        Scanner console = new Scanner(System.in);

        int numOfMenu = console.nextInt();
        while (true){
            switch (numOfMenu){
                case 1:
                    printAllBooks(books);
                    break;
                case 2:
                   addBook(console, books);
                    break;
                case 3:
                   removeBook(console,books);
                    break;
                case 4:
                case 0:
                    System.out.println("Thank you for using this app:)");
                    System.exit(0);

            }
            System.out.println("Please, choose your choice");
            numOfMenu = console.nextInt();
        }

    }

    private static void removeBook(Scanner console, List<String> books) {
        System.out.println("Write a name of book");
        String inputBook = console.next();
        if (books.contains(inputBook)) {
            books.remove(inputBook);
        } else {
            System.out.println("Book with name:" + inputBook + " is not found!");
        }
    }

    private static void addBook(Scanner console, List<String> books) {
        System.out.println("Write a name of book");
        String inputBook = console.next();
        books.add(inputBook);
    }

    public static void printMenu(){
        System.out.println("Menu:\n"+"1. All books\n"+"2. Add book\n"+"3. Delete book\n"+"4. Sort books\n"+"0. Exit");
    }

    private static void printAllBooks(List<String> books){
        System.out.println("Our books");
        for (int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }
    }
}

