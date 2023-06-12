package com.orange.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionService {
    public static void main(String[] args) {
        Book bookScrum = new Book("Scrum", "Jeff Sutherland");
        Book bookAgileLeader = new Book("Agile Leader", "Zuzana Sochova");
        Book bookDareToLead = new Book("Dare To Lead", "Brene Brown");
        Book book5Dysfunctions = new Book("5 Dysfunctions", "P. Lencioni");
        Book bookDailyStoic = new Book("Daily Stoic", "Ryan Holiday");
        Book bookChurchill = new Book("Churchill", "Erik Larson");

        Library classicLibrary = new Library("Librarius");
        classicLibrary.addBook(bookScrum);
        classicLibrary.addBook(bookAgileLeader);
        classicLibrary.addBook(book5Dysfunctions, bookDareToLead);
        classicLibrary.addBook(bookDailyStoic, bookChurchill);
        classicLibrary.printAllTheBooks();

        System.out.println(". No of books: " + classicLibrary.returnNumberOfBooks());

        classicLibrary.removeBook(9);
        System.out.println("1. The no of books is: " + classicLibrary.returnNumberOfBooks());
        classicLibrary.removeBook(bookScrum);
        System.out.println("2. The no of books is: " + classicLibrary.returnNumberOfBooks());
        classicLibrary.removeBook("Daily Stoic");
        System.out.println("3. The no of books is: " + classicLibrary.returnNumberOfBooks());

        Library tradLibrary = new Library("Ion Creanga");
        tradLibrary.addBook(book5Dysfunctions, bookChurchill);
        tradLibrary.addBook(bookAgileLeader, bookDareToLead);
        tradLibrary.addBook(bookScrum);
        System.out.println(tradLibrary.returnNumberOfBooks());

        Map<String, Library> librariesNetwork = new HashMap<>();
        librariesNetwork.put("Stefan Cel Mare 122 str.", classicLibrary);
        librariesNetwork.put ("Sciusev 34 str.", tradLibrary);
        librariesNetwork.get("Sciusev 34 str.").addBook(bookScrum);
        librariesNetwork.get("Stefan Cel Mare 122 str.").printAllTheBooks();
        librariesNetwork.get("Stefan Cel Mare 122 str.").addAnotherListOfBooksIntoTheLibraryList(tradLibrary.getBookList());
        librariesNetwork.get("Stefan Cel Mare 122 str.").printAllTheBooks();

    }
}
