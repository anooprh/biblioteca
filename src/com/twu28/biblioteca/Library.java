package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 7/17/12
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {

    private ArrayList<Book> book_database = new ArrayList<Book>();

    public boolean addBook(Book bookObject) {

        boolean status = addToDataBase(bookObject);
        return status;
    }

    public boolean addBook(Book[] bookobjects) {

        boolean status[] = new boolean[bookobjects.length];
        boolean finalStatus = true;
        for(int i = 0 ; i < bookobjects.length ; i++){
            status[i] = addToDataBase(bookobjects[i]);
            if(status[i] != true)
                finalStatus = false;
        }
        return finalStatus;
    }

    private boolean addToDataBase(Book bookObject) {
        return(book_database.add(bookObject));
    }

    public boolean reserveBook(String UserRequestedISBN) {
        return true;
    }

    public boolean findBook(String UserRequestedISBN) {
        return true;
    }

    public boolean displayAllBooks() {

        System.out.println("ISBN\t\t\t\tTitle\t\t\tAuthor\t\t\t\tPublisher\t\tEdition\t\t" +
                            "Year Of Publ\tNo Of Copies");
        boolean[] status = new  boolean[book_database.size()];
        boolean finalstatus = true;
        for(int i = 0 ; i < book_database.size() ; i++){
           status[i] = (book_database.get(i)).displayBookDetails();
           if(status[i] != true)
               finalstatus = false;
        }
        return finalstatus;
    }


}
