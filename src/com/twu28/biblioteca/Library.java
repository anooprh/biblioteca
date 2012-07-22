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
    private ArrayList<User> user_database = new ArrayList<User>();
    private ArrayList<Movie> movie_database = new ArrayList<Movie>();


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

     public int findBook(String UserRequestedISBN) {     //Checks if the Book is Present in the database/If
                                                         //Present It returns an index to that book,else returns -1
        int location;
        boolean[] status = new  boolean[book_database.size()];
        boolean finalstatus = false;
        for(int i = 0 ; i < book_database.size() ; i++){
            status[i] = (book_database.get(i)).amIHavingThisISBNNumber(UserRequestedISBN);
            if(status[i] == true){
                finalstatus = true;
                location = i;
                return location;
            }
        }
        location = -1;
        return location;
    }

    public boolean displayAllBooks() {

        System.out.println("---This is the DataBase Of all the Books in the library---");
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

    public boolean reserveBook(String UserRequestedISBN) {
        int location = findBook(UserRequestedISBN);            //Check the Books Availability in DataBase.
                                                               //If Present Return its index,else return -1
        if(location == -1){      //Book Not Present in DataBase
            //System.out.println("Sorry!! This Book is Not Present in The DataBase");
            return  false;
        }
        return book_database.get(location).reserveOneCopyOfThisBook();
    }

    public boolean addNewMember(User userbject) {
        boolean status = addToDataBase(userbject);
        return status;
    }

    public boolean addNewMember(User[] userobjects) {
        boolean status[] = new boolean[userobjects.length];
        boolean finalStatus = true;
        for(int i = 0 ; i < userobjects.length ; i++){
            status[i] = addToDataBase(userobjects[i]);
            if(status[i] != true)
                finalStatus = false;
        }
        return finalStatus;
    }

    private boolean addToDataBase(User userbject) {
        return user_database.add(userbject);
    }

    public int findUser(long libraryID) {
        int location;
        boolean[] status = new  boolean[user_database.size()];
        boolean finalstatus = false;
        for(int i = 0 ; i < user_database.size() ; i++){
            status[i] = (user_database.get(i)).amIHavingThisLIBRARYIDNumber(libraryID);
            if(status[i] == true){
                finalstatus = true;
                location = i;
                return location;
            }
        }
        location = -1;
        return location;
    }


    public boolean displayUserProfile(long libraryNumber) {
        int location = findUser(libraryNumber);
        if(location == -1){
            //System.out.println("This Member is Not Registered in Library");
            return false;
        }

        return user_database.get(location).displayDetails();
    }

    public boolean addMovie(Movie[] movieobjects) {

        boolean status[] = new boolean[movieobjects.length];
        boolean finalStatus = true;
        for(int i = 0 ; i < movieobjects.length ; i++){
            status[i] = addToDataBase(movieobjects[i]);
            if(status[i] != true)
                finalStatus = false;
        }
        return finalStatus;
    }

    private boolean addToDataBase(Movie movieobject) {
        return movie_database.add(movieobject);
    }

    public boolean viewMovieDataBase() {
        boolean status[] = new boolean[movie_database.size()];
        boolean finalStatus = true;
        System.out.println("Movie\tDirector\trating");
        for(int i = 0 ; i < movie_database.size() ; i++){
            status[i] = movie_database.get(i).viewMovieDetails();
            if(status[i] != true)
                finalStatus = false;
        }
        return finalStatus;  //To change body of created methods use File | Settings | File Templates.
    }
}
